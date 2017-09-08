package com.pc.bills;

import java.math.BigDecimal;

public class Bill {
	private final Integer accountId;
	private final int billDate;
	private final BigDecimal paidAmount;
	private final int directDebitDate;

	public Bill(Integer accountId, int billDate, BigDecimal paidAmount, int directDebitDate) {
		super();
		this.accountId = accountId;
		this.billDate = billDate;
		this.directDebitDate = directDebitDate;
		this.paidAmount = paidAmount != null ? paidAmount.setScale(2, BigDecimal.ROUND_HALF_UP) : null;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public int getBillDate() {
		return billDate;
	}

	public BigDecimal getPaidAmount() {
		BigDecimal result = null;
		if (this.paidAmount != null) {
			result = paidAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
		}
		return result;
	}

	public int getDirectDebitDate() {
		return directDebitDate;
	}

}
