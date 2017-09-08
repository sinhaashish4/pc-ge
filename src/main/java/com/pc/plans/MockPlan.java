package com.pc.plans;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MockPlan {
	Date date = new GregorianCalendar(2019, Calendar.FEBRUARY, 11).getTime();

	public List<Plan> getPlans() {
		return Arrays.asList(new Plan(11, 4, 21, "4GEE Max plan 40GB", new BigDecimal(67.99), date),
				new Plan(12, 3, 21, "4GEE Max plan", new BigDecimal(33.00), date),
				new Plan(13, 1, 21, "Max plan 2GB", new BigDecimal(22.60), date));
	}
}
