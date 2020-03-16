package com.interview.bean;

import lombok.Data;

@Data
public class CategoryBean {
    private Integer ctId;

    private Integer ctParentCtId;

    private String ctTitle;

    private Integer ctStatus = 1;

    private String ctParam1;

    private String ctParam2;

    private String ctParam3;

    private String ctParam4;

    private String ctParam5;

}