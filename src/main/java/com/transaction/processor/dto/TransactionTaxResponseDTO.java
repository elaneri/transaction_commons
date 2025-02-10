package com.transaction.processor.dto;

import java.io.Serializable;
import java.util.List;

public class TransactionTaxResponseDTO implements Serializable {

	private static final long serialVersionUID = -6396650976640850824L;

	private List<TransactionDetailResposeDTO> transactions;

	public List<TransactionDetailResposeDTO> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionDetailResposeDTO> transactions) {
		this.transactions = transactions;
	}

}
