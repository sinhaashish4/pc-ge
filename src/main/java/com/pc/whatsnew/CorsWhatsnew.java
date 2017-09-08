package com.pc.whatsnew;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/whatsnew")
public class CorsWhatsnew {
	@Autowired
	private MockWhatsnew mock;

	@GetMapping
	public List<Whatsnew> getList() {
		return mock.getList();
	}
}
