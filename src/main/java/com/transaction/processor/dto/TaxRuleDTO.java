package com.transaction.processor.dto;

import java.math.BigDecimal;

public class TaxRuleDTO {

	private String currency;
	private BigDecimal tax;
	private Long id;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
