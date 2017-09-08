package com.pc.menu;

import java.util.Arrays;
import java.util.List;

public class MockPlan {

	public List<Plan> getList() {
		return Arrays.asList(
				new Plan(1, "Pay as you go"), 
				new Plan(2, "1000 Plus for £5"), 
				new Plan(3, "More Data"), 
				new Plan(4, "More calls"), 
				new Plan(5, "Latest upgrade"), 
				new Plan(6, "Best Deal"), 
				new Plan(7, "Unlimitted plus"), 
				new Plan(8, "Unlimitted Calls"), 
				new Plan(9, "Chat only"), 
				new Plan(10, "Money Saving") 
		);
	}
}
