package com.transaction.processor.dto;

import java.math.BigDecimal;

public class TransactionDetailResposeDTO extends TransactionDetailDTO{
	private static final long serialVersionUID = -566348158535518105L;
	private BigDecimal tax;

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
}
