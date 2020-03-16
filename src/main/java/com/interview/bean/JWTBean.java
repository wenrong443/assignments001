package com.interview.bean;

import lombok.Data;

@Data
public class JWTBean {
    private Integer jtId;

    private Integer jtUtId;

    private String jtToken;

    private Long jtExpiredOn;

}