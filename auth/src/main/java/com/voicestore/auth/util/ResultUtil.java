package com.voicestore.auth.util;

import com.voicestore.auth.model.dto.Result;
import com.voicestore.auth.model.dto.ResultCode;

public class ResultUtil {


    public static Result makeSuccessResult(ResultCode resultCode) {
        Result sr = new Result();
        sr.setMessage(resultCode.getMessage());
        sr.setCode(resultCode.getCode());
        return sr;
    }

}
