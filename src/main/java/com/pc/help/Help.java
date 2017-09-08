package com.pc.help;

import java.util.List;

public class Help {
	private String topic;
	private List<Help> topics;
	private String details;

	public Help(String topic, String details, List<Help> topics) {
		super();
		this.topic = topic;
		this.topics = topics;
		this.details = details;
	}

	public String getTopic() {
		return topic;
	}

	public List<Help> getTopics() {
		return topics;
	}

	public String getDetails() {
		return details;
	}

}
