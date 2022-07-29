package com.board.board.model.dto;

import lombok.Data;
import lombok.Getter;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

@Data
public class ResultWithResult extends Result{

    private T result;
}
