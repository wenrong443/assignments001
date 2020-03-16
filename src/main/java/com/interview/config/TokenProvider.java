package com.interview.config;

import com.interview.bean.RoleBean;
import com.interview.shortcut.ApplicationConfigService;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.interview.bean.system.Constants.ACCESS_TOKEN_VALIDITY_SECONDS;
import static com.interview.bean.system.Constants.AUTHORITIES_KEY;
import static com.interview.bean.system.Constants.SIGNING_KEY;

@Component
public class TokenProvider implements Serializable {

    @Autowired
    private ApplicationConfigService acs;

    public String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser()
                .setSigningKey(SIGNING_KEY)
                .parseClaimsJws(token)
                .getBody();
    }

    private Boolean isTokenExpired(String token) {
        try {
            String username = acs.jwtService.getUsernameByToken(token);

            if (!(username == null || username.equals("-") || username.equals(""))) {
                return false;
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return true;
    }

    public String generateToken(Authentication authentication) {
        final String authorities = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));
        return Jwts.builder()
                .setSubject(authentication.getName())
                .claim(AUTHORITIES_KEY, authorities)
                .signWith(SignatureAlgorithm.HS256, SIGNING_KEY)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + ACCESS_TOKEN_VALIDITY_SECONDS * 1000))
                .compact();
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
        String username = "";
        try {
            username = acs.jwtService.getUsernameByToken(token);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (
                username.equals(userDetails.getUsername())
                        && !isTokenExpired(token));
    }

    UsernamePasswordAuthenticationToken getAuthentication(final String token, final Authentication existingAuth, final UserDetails userDetails) {
        int ut_id = 0;

        try {
            ut_id = acs.jwtService.getUtIdeByToken(token);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<RoleBean> roleBeanList = acs.userService.getRoleByUtId(ut_id);

        String roles[] = new String[roleBeanList.size()];

        for (int i = 0; i < roleBeanList.size(); i++) {
            roles[i] = "ROLE_" + roleBeanList.get(i).getRtName();
        }

        final Collection<? extends GrantedAuthority> authorities =
                Arrays.stream(roles)
                        .map(SimpleGrantedAuthority::new)
                        .collect(Collectors.toList());

        return new UsernamePasswordAuthenticationToken(userDetails, "", authorities);
    }

}
