package vip.alphax.utils;

import java.io.Serializable;

/**
 * Created by admin on 2018/11/27.
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 7597027291126600201L;

    private Integer code;

    private String message;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
