package com.pc.settings;

import java.util.List;

public class Setting {
	private String topic;
	private List<Setting> subtopics;

	public Setting(String topic, List<Setting> subtopics) {
		super();
		this.topic = topic;
		this.subtopics = subtopics;
	}

	public String getTopic() {
		return topic;
	}

	public List<Setting> getSubtopics() {
		return subtopics;
	}
}
