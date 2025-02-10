package com.transaction.processor.dto;

import java.io.Serializable;

public class TransactionDetailDTO implements Serializable {
	private static final long serialVersionUID = -7321769013919334625L;

	private String description;
	private String transactionId;
	private String batchTransactionId;

	private TransactionAmountDTO transactionAmount;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TransactionAmountDTO getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(TransactionAmountDTO transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getBatchTransactionId() {
		return batchTransactionId;
	}

	public void setBatchTransactionId(String batchTransactionId) {
		this.batchTransactionId = batchTransactionId;
	}
}
