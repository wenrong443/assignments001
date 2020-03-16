package com.interview.helper;

import com.github.pagehelper.PageHelper;
import com.interview.bean.system.RequestResult;
import com.interview.util.ErrorCode;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceHelper {
    public RequestResult standardizeWithObject(Object object, String errorMessage) {
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

    public RequestResult standardizeWithObject(Object object, String errorMessage, int totalPage) {
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
