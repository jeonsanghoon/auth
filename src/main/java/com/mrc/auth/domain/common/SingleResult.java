package com.mrc.auth.domain.common;

public class SingleResult<T> extends CommonResult {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
