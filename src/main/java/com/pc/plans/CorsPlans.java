package com.pc.plans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/plans")
public class CorsPlans {
	@Autowired
	private MockPlan mock;

	@GetMapping
	public List<Plan> getPlans() {
		return mock.getPlans();
	}

	@GetMapping("/{accountId}")
	public Plan read(@PathVariable("accountId") int accountId) throws Exception {
		List<Plan> list = mock.getPlans();
		Plan Plan = list.stream().filter(b -> b.getAccountId() == accountId).findFirst().get();
		return Plan;
	}

}
