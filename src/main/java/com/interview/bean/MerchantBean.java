package com.interview.bean;

import lombok.Data;

@Data
public class MerchantBean {
    private Integer mtId;

    private Integer mtStatus = 1;

    private String mtTitle;

    private String mtParam1;

    private String mtParam2;

    private String mtParam3;

    private String mtParam4;

    private String mtParam5;

}