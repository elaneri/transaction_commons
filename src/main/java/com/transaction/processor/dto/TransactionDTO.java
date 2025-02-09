package com.transaction.processor.dto;

import java.io.Serializable;
import java.util.List;

public class TransactionDTO implements Serializable {

	private static final long serialVersionUID = -6396650976640850824L;
	
	private String batchTransactionId;

	
	private List<TransactionDetailDTO> transactionDetail;

	public List<TransactionDetailDTO> getTransactionDetail() {
		return transactionDetail;
	}

	public void setTransactionDetail(List<TransactionDetailDTO> transactionDetail) {
		this.transactionDetail = transactionDetail;
	}
	

	public String getBatchTransactionId() {
		return batchTransactionId;
	}

	public void setBatchTransactionId(String batchTransactionId) {
		this.batchTransactionId = batchTransactionId;
	}

}
