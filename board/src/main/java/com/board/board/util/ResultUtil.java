package com.board.board.util;

import com.board.board.model.dto.Result;
import com.board.board.model.dto.ResultCode;

public  class ResultUtil {


    public static Result makeResult(ResultCode resultCode) {
        Result sr = new Result();
        sr.setMessage(resultCode.getMessage());
        sr.setCode(resultCode.getCode());
        return sr;
    }

}
