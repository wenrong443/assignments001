package com.interview.service;

import com.interview.shortcut.ApplicationConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service("utilsServiceImpl")
public class UtilsServiceImpl {
    Logger logger = LoggerFactory.getLogger(UtilsServiceImpl.class);


    @Autowired
    private ApplicationConfigService acs;

    private final String USER_AGENT = "Mozilla/5.0";


    public String charcters = "acefghkmnpqrstuvwxyz";
    public String digits = "2356789";
    public String mixCharcters = "acefghkmnpqrstuvwxyz2356789";
    public SecureRandom rnd = new SecureRandom();

    public String getCurrentTimestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }



    public String getClientIp(HttpServletRequest request) {
        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        return remoteAddr;
    }

    public String urlEncode(String value) {
        try {
            value = URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return value;
    }


    public String roundOff2DP(double value) {
        String result = String.format("%.2f", value);
        return result;
    }


    public long convertMinutesToMilliseconds(int minutes) {
        return minutes * 60000;
    }

}
