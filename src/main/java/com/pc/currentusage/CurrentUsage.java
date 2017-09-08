package com.pc.currentusage;

import java.math.BigDecimal;

public class CurrentUsage {
	private final Integer accountId;
	private final String userName;
	private final String phoneModle;
	private final String dataLeft;
	private final int allowanceRestartDays;
	private final BigDecimal bill;

	public CurrentUsage(Integer accountId, String userName, String phoneModle, String dataLeft,
			int allowanceRestartDays, BigDecimal bill) {
		super();
		this.accountId = accountId;
		this.userName = userName;
		this.phoneModle = phoneModle;
		this.dataLeft = dataLeft;
		this.allowanceRestartDays = allowanceRestartDays;
		this.bill = bill.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public BigDecimal getBill() {
		return bill;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public String getUserName() {
		return userName;
	}

	public String getPhoneModle() {
		return phoneModle;
	}

	public String getDataLeft() {
		return dataLeft;
	}

	public int getAllowanceRestartDays() {
		return allowanceRestartDays;
	}

}
