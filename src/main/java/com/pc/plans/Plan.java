package com.pc.plans;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Plan {
	private final int accountId;
	private final int totalPlans;
	private final int recurringDate;
	private final String name;
	private final BigDecimal price;
	private final String contractEndDate;

	public Plan(int accountId, int totalPlans, int recurringDate, String name, BigDecimal price, Date contractEndDate) {
		super();
		this.accountId = accountId;
		this.totalPlans = totalPlans;
		this.recurringDate = recurringDate;
		this.name = name;
		this.price = getTrauncatedPrice(price);
		this.contractEndDate = convertStringToDate(contractEndDate);
	}

	private String convertStringToDate(Date indate) {
		String dateString = null;
		SimpleDateFormat sdfr = new SimpleDateFormat("dd MMM yyyy");
		try {
			dateString = sdfr.format(indate);
		} catch (Exception ex) {
		}
		return dateString;
	}

	private BigDecimal getTrauncatedPrice(BigDecimal price) {
		if (price == null)
			return null;
		return price.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public int getAccountId() {
		return accountId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getTotalPlans() {
		return totalPlans;
	}

	public int getRecurringDate() {
		return recurringDate;
	}

	public String getName() {
		return name;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

}
