package com.interview.helper;

import com.interview.bean.system.RequestResult;
import com.interview.util.ErrorCode;
import com.interview.util.SuccessCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ControllerHelper {
    public static ResponseEntity<RequestResult> standardize(RequestResult requestResult){
        return requestResult.getResponseCode() == SuccessCode.SUCCESS_CODE ? new ResponseEntity<RequestResult>(requestResult, HttpStatus.OK) : new ResponseEntity<RequestResult>(requestResult, HttpStatus.BAD_REQUEST);
    }

    public static ResponseEntity<RequestResult> standardizeValidationFailed(String message){
        RequestResult requestResult = new RequestResult();
        requestResult.setResponseCode(ErrorCode.ERROR_CODE);
        requestResult.setMsg(ErrorCode.ERROR_CODE_MSG);
        requestResult.setContent(message);
        return requestResult.getResponseCode() == SuccessCode.SUCCESS_CODE ? new ResponseEntity<RequestResult>(requestResult, HttpStatus.OK) : new ResponseEntity<RequestResult>(requestResult, HttpStatus.BAD_REQUEST);
    }

    public static ResponseEntity<RequestResult> standardizeValidationSuccess(String message){
        RequestResult requestResult = new RequestResult();
        requestResult.setResponseCode(SuccessCode.SUCCESS_CODE);
        requestResult.setMsg(SuccessCode.SUCCESS_CODE_MSG);
        requestResult.setContent(message);
        return requestResult.getResponseCode() == SuccessCode.SUCCESS_CODE ? new ResponseEntity<RequestResult>(requestResult, HttpStatus.OK) : new ResponseEntity<RequestResult>(requestResult, HttpStatus.BAD_REQUEST);
    }
}
