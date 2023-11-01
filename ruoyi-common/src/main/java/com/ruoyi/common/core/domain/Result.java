package com.ruoyi.common.core.domain;

import com.ruoyi.common.constant.HttpStatus;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private Integer code;
    private String msg;

    private T data;

    public static <T> Result<T> success(){
        Result<T> result = new Result<>();
        result.code = HttpStatus.SUCCESS;
        return result;
    }

    public static <T> Result<T> success(T obj){
        Result<T> result = new Result<>();
        result.code = HttpStatus.SUCCESS;
        result.data = obj;
        return result;
    }

    public static <T> Result<T> error(String msg){
        Result<T> result = new Result<>();
        result.code = HttpStatus.ERROR;
        result.msg = msg;
        return result;
    }
}
