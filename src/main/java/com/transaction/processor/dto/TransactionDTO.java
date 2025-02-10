package com.transaction.processor.dto;

import java.io.Serializable;
import java.util.List;

public class TransactionDTO implements Serializable {

	private static final long serialVersionUID = -6396650976640850824L;
	

	
	private List<TransactionDetailDTO> transactions;

	public List<TransactionDetailDTO> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionDetailDTO> transactions) {
		this.transactions = transactions;
	}
	


}
