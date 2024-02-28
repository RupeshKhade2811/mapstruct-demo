package com.massil.mapstruct.mapstructdemo.dto;

import lombok.Data;

@Data
public class Response {
    private Integer code;
    private String message;
    private Boolean status;
    public Response(){}

    public Response(Integer code, String message, Boolean status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }
}
