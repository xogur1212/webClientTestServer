package com.voicestore.voicestore.util;

import com.voicestore.voicestore.model.dto.Result;
import com.voicestore.voicestore.model.dto.ResultCode;

public  class ResultUtil {


    public static Result makeSuccessResult(ResultCode resultCode) {
        Result sr = new Result();
        sr.setMessage(resultCode.getMessage());
        sr.setCode(resultCode.getCode());
        return sr;
    }

}
