package com.mayconbertucci.mc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long tineStamp;
	
	public StandardError(Integer status, String msg, Long tineStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.tineStamp = tineStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTineStamp() {
		return tineStamp;
	}

	public void setTineStamp(Long tineStamp) {
		this.tineStamp = tineStamp;
	}
	
	
}
