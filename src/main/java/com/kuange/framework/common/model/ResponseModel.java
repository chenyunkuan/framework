/**
 * Copyright(c) 2010-2015 by XiangShang360 Inc.
 * All Rights Reserved
 */
package com.kuange.framework.common.model;

import java.io.Serializable;

/**
 * ResponseEntity
 * Created by routine on 14-10-17.
 */
public class ResponseModel implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4048926873373550888L;

	/**
     * 返回状态码
     */
    private int code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 数据模型
     */
    private Object data;

    public ResponseModel(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseEntity [code=" + code + ", message=" + message + ", data=" + data + "]";
    }
    
}
