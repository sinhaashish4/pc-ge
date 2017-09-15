package com.pc.bills;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BillMock {
	public List<Bill> getBills() {
		return Arrays.asList(
				new Bill(11, 21, new BigDecimal(106.54), 29, new Date()), 
				new Bill(12, 5, new BigDecimal(60.54), 10, new Date()),
				new Bill(13, 20, new BigDecimal(70.54), 25 , new Date()));
	}

	public List<Bill> getHistor(Integer accountId) {
		Calendar calendar1 = new GregorianCalendar(2017,1,21);
		Calendar calendar2 = new GregorianCalendar(2017,2,21);
		Calendar calendar3 = new GregorianCalendar(2017,3,21);
		Calendar calendar4 = new GregorianCalendar(2017,4,21);
		Calendar calendar5 = new GregorianCalendar(2017,5,21);
		Calendar calendar6 = new GregorianCalendar(2017,6,21);
		
		
		
		return Arrays.asList(
				new Bill(accountId, 21, new BigDecimal(106.54), 29, calendar6.getTime()), 
				new Bill(accountId, 5, new BigDecimal(60.54), 10, calendar5.getTime()),
				new Bill(accountId, 20, new BigDecimal(66), 25, calendar4.getTime()),
				new Bill(accountId, 20, new BigDecimal(55.33), 25, calendar3.getTime()),
				new Bill(accountId, 20, new BigDecimal(44.55), 25, calendar2.getTime()),
				new Bill(accountId, 20, new BigDecimal(77.50), 25, calendar1.getTime())
				);
	}

}
