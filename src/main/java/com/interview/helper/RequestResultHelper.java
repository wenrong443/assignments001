package com.interview.helper;

import com.interview.bean.system.RequestResult;
import com.interview.util.ErrorCode;

import java.util.Optional;

public class RequestResultHelper {

    public static RequestResult standardizeWithObject(Object object, String errorMessage) {
        RequestResult requestResult = new RequestResult();

        if (object == null || object.toString().equals("")) {
            requestResult.setResponseCode(ErrorCode.ERROR_CODE);
            requestResult.setMsg(ErrorCode.ERROR_CODE_MSG);
            requestResult.setContent(errorMessage);
        } else {
            Optional<Object> optional = Optional.ofNullable(object);
            requestResult.setContent(optional.orElseGet(Object::new));
        }

        return requestResult;
    }

    public static RequestResult standardizeWithObject(Object object, String errorMessage, int totalPage) {
        RequestResult requestResult = new RequestResult();

        if (object == null || object.toString().equals("")) {
            requestResult.setResponseCode(ErrorCode.ERROR_CODE);
            requestResult.setMsg(ErrorCode.ERROR_CODE_MSG);
            requestResult.setContent(errorMessage);
        } else {
            Optional<Object> optional = Optional.ofNullable(object);
            requestResult.setContent(optional.orElseGet(Object::new));
            requestResult.setTotalPage(totalPage + "");
        }

        return requestResult;
    }

}
