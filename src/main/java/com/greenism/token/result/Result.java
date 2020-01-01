package com.greenism.token.result;


import com.greenism.token.enums.ErrorEnum;

public class Result<T> {

    private int code;
    private String msg;
    private T data;

    /**
     * 成功时候的调用
     * */
    public static <T> Result<T> success(T data){
        return new  Result<>(data);
    }

    /**
     * 失败时候的调用
     * */
    public static <T> Result<T> error(ErrorEnum errorEnum){
        return new Result<>(errorEnum);
    }

    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

//    private Result(String message) {
//        if(message == null) {
//            return;
//        }
//        this.code = -1;
//        this.msg = message;
//    }

    private Result(ErrorEnum errorEnum) {
        if(errorEnum == null) {
            return;
        }
        this.code = errorEnum.getState();
        this.msg = errorEnum.getInfo();
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
    public T getData() {
        return data;
    }

}
