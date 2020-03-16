package com.interview.controller;

import com.interview.config.TokenProvider;
import com.interview.bean.system.AuthToken;
import com.interview.bean.system.LoginUser;
import com.interview.shortcut.ApplicationConfigService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenProvider jwtTokenUtil;

    @Autowired
    private ApplicationConfigService acs;

    /**
    {
        "password": "123456",
        "email": "user001@test.com"
    }
     */
    @ApiOperation(value = "Generate access token (email: user001@test.com & password: 123456)", httpMethod = "POST")
    @ApiResponses(value = {
            @ApiResponse(code = 1, message = "{\"password\":\"123456\",\"email\":\"user001@test.com\"}"),
            @ApiResponse(code = 200, message = "{\"token\":\"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ3ZW5yb25nNDQzQG91dGxvb2suY29tIiwic2NvcGVzIjoiUk9MRV9VU0VSIiwiaWF0IjoxNTgwNjE4ODM2LCJleHAiOjE1ODA2MzY4MzZ9.riM09H7VcMZ1V1w2UYzlVlXFNLBL0YsJK8KSwHHwZJw\"}"),
            @ApiResponse(code = 401, message = "{\"timestamp\":\"2020-02-02T04:48:15.340+0000\",\"status\":401,\"error\":\"Unauthorized\",\"message\":\"Unauthorized\",\"path\":\"/s001/auth/generate-token\"}")})
    @RequestMapping(value = "/generateToken", method = RequestMethod.POST)
    public ResponseEntity<?> generateTokenUser(@Valid @RequestBody LoginUser loginUser, HttpServletRequest servletRequest) throws AuthenticationException {
        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginUser.getEmail(),
                        loginUser.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final String token = acs.jwtService.generateToken(loginUser.getEmail(), jwtTokenUtil.generateToken(authentication));
        return ResponseEntity.ok(new AuthToken(token));
    }


}
