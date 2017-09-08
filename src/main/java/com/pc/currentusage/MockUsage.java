package com.pc.currentusage;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MockUsage {
	public List<CurrentUsage> getList() {
		return Arrays.asList(
				new CurrentUsage(11, "Ash", "Samsung Galaxy S8+", "19.65", 23, new BigDecimal(106.99)),
				new CurrentUsage(12, "Rob", "Nokia+", "10.00", 10,new BigDecimal(50.00)), 
				new CurrentUsage(13, "James", "Iphone 7", "5", 15, new BigDecimal(66.50))
		);
	}
}
