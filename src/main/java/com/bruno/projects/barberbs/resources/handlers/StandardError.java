package com.bruno.projects.barberbs.resources.handlers;

import java.io.Serializable;
import java.util.Date;

public class StandardError implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Date time;
	
	public StandardError(Integer status, String msg, Date time) {
		super();
		this.status = status;
		this.msg = msg;
		this.time = time;
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

	public Date getTime() {
		return time;
	}
	
}
