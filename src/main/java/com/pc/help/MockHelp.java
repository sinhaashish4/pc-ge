package com.pc.help;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MockHelp {

	public List<Help> getList() {
		return Arrays.asList(new Help("Current Usage", null, buildCurrentUsageSubTopics()),
				new Help("Bills & Payments", null, buildCurrentUsageSubTopics()),
				new Help("Plan & Add-ons", null, buildCurrentUsageSubTopics()),
				new Help("Feedback", null, buildCurrentUsageSubTopics()),
				new Help("Signal issues", null, buildCurrentUsageSubTopics()),
				new Help("Get in touch", null, buildCurrentUsageSubTopics()),
				new Help("Settings", null, buildCurrentUsageSubTopics()));
	}

	private List<Help> buildCurrentUsageSubTopics() {
		new Help("Why's my bill higher than usual?", "Here are the main resons. blah blah blah.", null);
		new Help("Why do I keep running out of data?", "Here are the main resons. blah blah blah.", null);
		new Help("How do I get more data?", "Here are the main resons. blah blah blah.", null);
		new Help("When do my allowances restart?", "Here are the main resons. blah blah blah.", null);
		new Help("How do I pay my bill?", "Here are the main resons. blah blah blah.", null);
		return null;
	}
}
