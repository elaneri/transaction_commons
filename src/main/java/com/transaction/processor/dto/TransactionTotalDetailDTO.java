package com.transaction.processor.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransactionTotalDetailDTO implements Serializable {
	private static final long serialVersionUID = -1825853693364656912L;

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getShipping() {
		return shipping;
	}

	public void setShipping(BigDecimal shipping) {
		this.shipping = shipping;
	}

	private BigDecimal subtotal;
	private BigDecimal shipping;

	@Override
	public String toString() {
		return "TransactionDetailDTO [subtotal=" + subtotal + ", shipping=" + shipping + "]";
	}
}
