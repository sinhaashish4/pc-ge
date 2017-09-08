package com.pc.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanMenusRelation {
	
	@Autowired
	private MockMenu mockMenu;
	
	public PlanMenus get(Integer planId) {
		PlanMenus result = null;
		switch(planId) {
		case 1: 
			Plan plan1 = new Plan(1, "Pay as you go");
			result = build(plan1, 0, 4);
			break;
		case 2: 
			Plan plan2 = new Plan(2, "1000 Plus for £5");
			result = build(plan2, 1, 5);
			break;
		case 3: 
			Plan plan3 = new Plan(3, "More Data");
			result = build(plan3, 2, 6);
			break;
		case 4: 
			Plan plan4 = new Plan(4, "More calls");
			result = build(plan4, 0, 3);
			break;
		case 5: 
			Plan plan5 = new Plan(5, "Latest upgrade");
			result = build(plan5, 0, 4);
			break;
		case 6: 
			Plan plan6 = new Plan(6, "Best Deal");
			result = build(plan6, 0, 5);
			break;
		default:
			Plan plan7 = new Plan(7, "Unlimitted plus");
			result = build(plan7, 0, 7);
			break;
		}
		
		return result;
	}

	private PlanMenus build(Plan plan, int start, int end) {
		List<Menu> menus = mockMenu.getList().subList(start, end);
		return new PlanMenus(plan, menus);
	}
	
//	new Plan(1, "Pay as you go"), 
//	new Plan(2, "1000 Plus for £5"), 
//	new Plan(3, "More Data"), 
//	new Plan(4, "More calls"), 
//	new Plan(5, "Latest upgrade"), 
//	new Plan(6, "Best Deal"), 
//	new Plan(7, "Unlimitted plus"), 
//	new Plan(8, "Unlimitted Calls"), 
//	new Plan(9, "Chat only"), 
//	new Plan(10, "Money Saving") 

	
}
