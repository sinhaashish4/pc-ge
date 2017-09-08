package com.pc.currentusage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping
public class CorsUsage {
	@Autowired
	private MockUsage mock;

	@GetMapping("/usage")
	public List<CurrentUsage> getList() {
		return mock.getList();
	}

	@GetMapping("/usage/{accountId}")
	public CurrentUsage read(@PathVariable("accountId") Integer accountId) throws Exception {
		List<CurrentUsage> list = mock.getList();
		CurrentUsage usage = list.stream().filter(b -> b.getAccountId().equals(accountId)).findFirst().get();
		return usage;
	}

}
