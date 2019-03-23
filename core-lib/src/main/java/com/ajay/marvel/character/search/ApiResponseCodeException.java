package com.ajay.marvel.character.search;

/**
 * @Author Created by AjayDeepak on 08/09/201811/11/2016.
 */

public class ApiResponseCodeException extends Exception {
    private int code;
    private String status;

    public ApiResponseCodeException(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

}
