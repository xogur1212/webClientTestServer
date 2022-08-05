package com.test.webClientTestServer.model.dto;



public enum HeaderCode {

    OK(200),CREATED(201),ACCEPTED(202),NO_CONTENT(204),BAD_REQUEST(400),UNAUTHORIZED(401),NOT_FOUND(404);

    private int code;

    HeaderCode(int code){
        this.code =code;

    }
    public int getCode(){
        return code;
    }

}
