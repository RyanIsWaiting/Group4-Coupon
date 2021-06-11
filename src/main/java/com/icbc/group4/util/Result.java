package com.icbc.group4.util;

/**
 * 返回信息封装
 * @param <T> 可变类型
 */
public class Result<T> {
    /**
     * 返回信息
     */
    private String msg;

    /**
     * 操作是否正常
     */
    private boolean success;

    /**
     * 请求数据
     */
    private T detail;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }
}
