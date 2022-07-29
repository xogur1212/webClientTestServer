package com.board.board.util;

import com.board.board.model.dto.Result;
import com.board.board.model.dto.ResultCode;
import com.board.board.model.dto.ResultWithResult;
import org.apache.poi.ss.formula.functions.T;

public  class ResultUtil {


    public static Result makeResult(ResultCode resultCode, T result) {
        ResultWithResult sr = new ResultWithResult();
        sr.setMessage(resultCode.getMessage());
        sr.setCode(resultCode.getCode());
        sr.setResult(result);

        return sr;
    }

    public static Result makeResult(ResultCode resultCode) {
        Result sr = new Result();
        sr.setMessage(resultCode.getMessage());
        sr.setCode(resultCode.getCode());

        return sr;
    }

}
