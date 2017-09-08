package com.pc.settings;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MockSetting {

	public List<Setting> getList() {
		return Arrays.asList(new Setting("Logging in", bildSubtopic()), new Setting("Use Phone Contacts", null),
				new Setting("Use Content Lock", null), new Setting("Log Out", null));
	}

	private List<Setting> bildSubtopic() {
		return Arrays.asList(new Setting("Use PIN", null), new Setting("Change PIN", null),
				new Setting("Use fingerprint", null));

	}

}
