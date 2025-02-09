package com.transaction.processor.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransactionAmountDTO implements Serializable {
	private static final long serialVersionUID = -8092210529170598456L;
	private BigDecimal total;
	private String currency;
	private TransactionTotalDetailDTO detail;

	public TransactionTotalDetailDTO getDetail() {
		return detail;
	}

	public void setDetail(TransactionTotalDetailDTO detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "TransactionAmountDTO [total=" + total + ", currency=" + currency + ", detail=" + detail + "]";
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
