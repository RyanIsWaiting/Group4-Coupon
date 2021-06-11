package com.icbc.group4.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.icbc.group4.util.ErrorCode;

@SuppressWarnings("serial")
public abstract class BaseException extends RuntimeException{
	/**
	 * 
	 */
	private final ErrorCode error;
    private final HashMap<String, Object> data = new HashMap<String, Object>();

    public BaseException(ErrorCode error, Map<String, Object> data) {
        super(error.getMessage());
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    protected BaseException(ErrorCode error, Map<String, Object> data, Throwable cause) {
        super(error.getMessage(), cause);
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    public ErrorCode getError() {
        return error;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
