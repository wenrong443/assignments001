package com.interview.bean;

import lombok.Data;

@Data
public class ProductImageBean {
    private Integer pitId;

    private String pitPath;

    private Integer pitPtId;

    private Integer pitStatus = 1;

    private String pitParam1;

    private String pitParam2;

    private String pitParam3;

    private String pitParam4;

    private String pitParam5;

}