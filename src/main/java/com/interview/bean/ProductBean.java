package com.interview.bean;

import com.interview.util.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel(description = "Product Information")
public class ProductBean {
    private Integer ptId;

    @ApiModelProperty(value = "URL")
    private String ptUrl;

    @ApiModelProperty(value = "Title")
    private String ptTitle;

    @ApiModelProperty(value = "Category ID")
    private Integer ptCtId = null;
    private String ptCtIdDesc;

    @ApiModelProperty(value = "Price")
    private Float ptPrice = null;

    @ApiModelProperty(value = "MSRP")
    private Integer ptMsrp;

    @ApiModelProperty(value = "Available ( 1 - True / 0 - False")
    private Integer ptStatus = null;

    @ApiModelProperty(value = "Category ID")
    private Integer ptMtId = null;
    private String ptMtIdDesc;

    private String ptParam1; // lower case of title

    private String ptParam2;

    private String ptParam3;

    private String ptParam4;

    private String ptParam5;

    @ApiModelProperty(value = "Description")
    private String ptDescription;

    @ApiModelProperty(value = "List of Images")
    private List<ProductImageBean> productImageBeanList = new ArrayList<>();

}