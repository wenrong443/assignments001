package com.interview.bean;

import lombok.Data;

@Data
public class UserBean {
    private Integer utId;

    private String utEmail;

    private String utPassword;

    private String utParam1;

    private String utParam2;

    private String utParam3;

    private String utParam4;

    private String utParam5;

    private Integer utStatus = 1;

}