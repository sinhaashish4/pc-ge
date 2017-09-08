package com.pc.customer;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pc.menu.PlanMenus;
import com.pc.menu.PlanMenusRelation;

@CrossOrigin
@RestController
@RequestMapping("/customerplan")
public class CustomerPlan {
	
	@Autowired
	private PlanMenusRelation planMenusRelation;
	
	@GetMapping("/{accountId}")
	public PlanMenus get(@PathVariable("accountId") Integer accountId) {
		Integer customerPlanId = this.customerPlan.get(accountId);
		PlanMenus planMenus = planMenusRelation.get(customerPlanId);
		return planMenus;
	}
	
	private  Map<Integer, Integer> customerPlan;
	
	@PostConstruct
	public void customerPlanMap () {
		customerPlan = new HashMap<>();
		customerPlan.put(11, 7);
		customerPlan.put(12, 6);
		customerPlan.put(13, 5);
	}
}
