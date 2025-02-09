package com.transaction.processor.dto;

import java.io.Serializable;

public class TransactionDto implements Serializable {

	private static final long serialVersionUID = -4083579468487564614L;

	@Override
	public String toString() {
		return "TransactionDto [msg=" + msg + ", id=" + id + "]";
	}

	private String msg;
	private Integer id;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
