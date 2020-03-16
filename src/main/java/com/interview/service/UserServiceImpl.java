package com.interview.service;

import com.interview.bean.*;
import com.interview.helper.ServiceHelper;
import com.interview.shortcut.ApplicationConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Service("userServiceImpl")
public class UserServiceImpl implements UserDetailsService {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private ApplicationConfigService acs;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserBean userBean = getUserBeanByEmailOrUsername(s, true);

        if (userBean == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }

        return new org.springframework.security.core.userdetails.User(userBean.getUtEmail(), userBean.getUtPassword(), getAuthority(userBean.getUtId()));
    }

    public UserBean getUserBeanByEmailOrUsername(String email, boolean returnPassword) {
        email = email.toLowerCase();
        UserBeanExample userBeanExample = new UserBeanExample();
        userBeanExample.createCriteria().andUtEmailEqualTo(email).andUtStatusEqualTo(1);

        List<UserBean> userBeanList = acs.mapperService.userBeanMapper.selectByExample(userBeanExample);

        if (!returnPassword && userBeanList.size() != 0) {
            userBeanList.get(0).setUtPassword(null);
        }

        return userBeanList.size() == 0 ? null : userBeanList.get(0);
    }

    public UserBean getUserBeanByUtId(int ut_id) {
        return acs.mapperService.userBeanMapper.selectByPrimaryKey(ut_id);
    }

    private Set<SimpleGrantedAuthority> getAuthority(int ut_id) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();

        RoleBeanExample roleBeanExample = new RoleBeanExample();
        roleBeanExample.createCriteria().andRtUtIdEqualTo(ut_id + "").andRtStatusEqualTo(1);

        List<RoleBean> roleBeanList = getRoleByUtId(ut_id);
        roleBeanList.forEach(roleBean -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + roleBean.getRtName()));
        });

        return authorities;
    }

    public List<RoleBean> getRoleByUtId(int ut_id) {
        RoleBeanExample roleBeanExample = new RoleBeanExample();
        roleBeanExample.createCriteria().andRtUtIdEqualTo(ut_id + "").andRtStatusEqualTo(1);

        List<RoleBean> roleBeanList = acs.mapperService.roleBeanMapper.selectByExample(roleBeanExample);
        return roleBeanList;
    }
}
