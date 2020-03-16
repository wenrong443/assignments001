package com.interview.bean.system;

import com.interview.util.SuccessCode;
import lombok.Data;

@Data
public class RequestResult {
    private String responseCode = SuccessCode.SUCCESS_CODE; //success
    private String msg = SuccessCode.SUCCESS_CODE_MSG;
    private Object content;
    private String totalPage = "";
}
