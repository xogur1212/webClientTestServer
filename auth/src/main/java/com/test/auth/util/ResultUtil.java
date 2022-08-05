package com.test.auth.util;

import com.test.auth.model.dto.Result;
import com.test.auth.model.dto.ResultCode;

public class ResultUtil {


    public static Result makeSuccessResult(ResultCode resultCode) {
        Result sr = new Result();
        sr.setMessage(resultCode.getMessage());
        sr.setCode(resultCode.getCode());
        return sr;
    }

}
