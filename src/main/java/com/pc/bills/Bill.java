package com.pc.bills;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
	private final Integer accountId;
	private final int billDate;
	private final BigDecimal paidAmount;
	private final int directDebitDate;
	private final Date date;

	public Bill(Integer accountId, int billDate, BigDecimal paidAmount, int directDebitDate, Date date) {
		super();
		this.accountId = accountId;
		this.billDate = billDate;
		this.directDebitDate = directDebitDate;
		this.paidAmount = paidAmount != null ? paidAmount.setScale(2, BigDecimal.ROUND_HALF_UP) : null;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

}
