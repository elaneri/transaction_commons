package com.transaction.processor.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransactionAmountDTO implements Serializable {
	private static final long serialVersionUID = -8092210529170598456L;
	private BigDecimal total;
	private String currency;
	private TransactionTotalDetailDTO details;

	@Override
	public String toString() {
		return "TransactionAmountDTO [total=" + total + ", currency=" + currency + ", details=" + details + "]";
	}

	public TransactionTotalDetailDTO getDetails() {
		return details;
	}

	public void setDetails(TransactionTotalDetailDTO details) {
		this.details = details;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
