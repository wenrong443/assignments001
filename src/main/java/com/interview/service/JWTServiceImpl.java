package com.interview.service;

import com.interview.bean.JWTBean;
import com.interview.bean.JWTBeanExample;
import com.interview.bean.UserBean;
import com.interview.shortcut.ApplicationConfigService;
import com.interview.util.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.interview.bean.system.Constants.ACCESS_TOKEN_VALIDITY_SECONDS;

@Service
public class JWTServiceImpl {
    @Autowired
    private ApplicationConfigService acs;

    public String generateToken(String username, String token) {
        removeExpiredToken();
        UserBean userBean = acs.userService.getUserBeanByEmailOrUsername(username, false);

        long expiredOn = System.currentTimeMillis();
        expiredOn = expiredOn + (1000 * ACCESS_TOKEN_VALIDITY_SECONDS);

        JWTBean jwtBean = new JWTBean();
        jwtBean.setJtToken(token);
        jwtBean.setJtExpiredOn(expiredOn);
        jwtBean.setJtUtId(userBean.getUtId());

        acs.mapperService.jwtBeanMapper.insert(jwtBean);
        return token;
    }

    public void removeExpiredToken(){
        JWTBeanExample jwtBeanExample = new JWTBeanExample();
        jwtBeanExample.createCriteria().andJtExpiredOnLessThan(System.currentTimeMillis());
        acs.mapperService.jwtBeanMapper.deleteByExample(jwtBeanExample);
    }

    public String getUsernameByToken(String token) throws Exception {
        removeExpiredToken();
        JWTBean jwtBean = getJWTInfoByToken(token);

        long expiredOn = System.currentTimeMillis() + (1000 * ACCESS_TOKEN_VALIDITY_SECONDS);
        jwtBean.setJtExpiredOn(expiredOn);
        acs.mapperService.jwtBeanMapper.updateByPrimaryKey(jwtBean);

        UserBean userBean = acs.userService.getUserBeanByUtId(jwtBean.getJtUtId());

        return userBean.getUtEmail();
    }

    public int getUtIdeByToken(String token) throws Exception {
        removeExpiredToken();
        JWTBean jwtBean = getJWTInfoByToken(token);

        long expiredOn = System.currentTimeMillis() + (1000 * ACCESS_TOKEN_VALIDITY_SECONDS);
        jwtBean.setJtExpiredOn(expiredOn);
        acs.mapperService.jwtBeanMapper.updateByPrimaryKey(jwtBean);

        UserBean userBean = acs.userService.getUserBeanByUtId(jwtBean.getJtUtId());

        return userBean.getUtId();
    }

    public JWTBean getJWTInfoByToken(String token) throws Exception {
        removeExpiredToken();
        JWTBeanExample jwtBeanExample = new JWTBeanExample();
        jwtBeanExample.createCriteria().andJtTokenEqualTo(token);
        List<JWTBean> jwtBeanList = acs.mapperService.jwtBeanMapper.selectByExample(jwtBeanExample);

        if (jwtBeanList.size() == 0){
            throw new Exception(ErrorCode.JWT_USER_NOT_FOUND);
        }

        if (jwtBeanList.get(0).getJtExpiredOn() < System.currentTimeMillis()){
            throw new Exception(ErrorCode.JWT_TOKEN_EXPIRED);
        }

        return jwtBeanList.get(0);
    }
}
