package com.icbc.group4.Exceptions;

import java.util.Map;

import com.icbc.group4.util.ErrorCode;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends BaseException{
    /**
	 * 
	 */
	public ResourceNotFoundException(Map<String, Object> data) {
        super(ErrorCode.RESOURCE_NOT_FOUND, data);
    }
}
