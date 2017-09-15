package com.pc.bills;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/bills")
public class CorsBillService {
	@Autowired
	private BillMock billMock;

	@Autowired
	private BillMock mock;

	@GetMapping
	public List<Bill> getBills() {
		return mock.getBills();
	}
	
	@CrossOrigin
	@GetMapping("/{accountId}")
	public Bill read(@PathVariable("accountId") Integer accountId) throws Exception {
		List<Bill> list = billMock.getBills();
		Bill bill = list.stream().filter(b -> b.getAccountId().equals(accountId)).findFirst().get();
		return bill;
	}

	@CrossOrigin
	@GetMapping("/history/{accountId}")
	public List<Bill> history(@PathVariable("accountId") Integer accountId) throws Exception {
		List<Bill> list = billMock.getHistor(accountId);
		return list;
	}

}
