package com.pc.bills;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BillMock {
	public List<Bill> getBills() {
		return Arrays.asList(new Bill(11, 21, new BigDecimal(106.54), 29), new Bill(12, 5, new BigDecimal(60.54), 10),
				new Bill(13, 20, new BigDecimal(70.54), 25));
	}

}
