package com.test.webClientTestServer.model.dto;

import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

@Data
public class ResultWithResult extends Result{

    private T result;
}
