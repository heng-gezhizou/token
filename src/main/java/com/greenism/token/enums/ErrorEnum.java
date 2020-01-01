package com.greenism.token.enums;

/**
 * ClassName:ErrorEnum
 * Package:com.greenism.token.enums
 * Description
 *
 * @data:2020/1/1 17:55
 * @author:jiahongjie
 */
public enum ErrorEnum {

    SUCCESS(0,"成功"),

    ERROR(-1,"失败"),

    FAIL(100101,"失败");

     int state;
     String info;

    ErrorEnum(int state, String info) {
        this.state = state;
        this.info = info;
    }

    public int getState() {
        return state;
    }


    public String getInfo() {
        return info;
    }


    public static ErrorEnum stateOf(int index) {
        for (ErrorEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

}
