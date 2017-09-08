package com.pc.menu;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MockMenu {

	public List<Menu> getList() {
		return Arrays.asList(
				new Menu(1, "Home", "HomePage", "home"), 
				new Menu(2, "Current Usage", "CurrentUsagePage", "analytics"), 
				new Menu(3, "Bills & Payments", "BillsPaymentsPage", "calculator"), 
				new Menu(4, "Plans & Add-Ons", "PlansAddOnsPage", "add-circle"), 
				new Menu(5, "Whats New", "WhatsNewPage", "color-wand"), 
				new Menu(6, "Help", "HelpPage", "help"), 
				new Menu(7, "Settings", "SettingsPage", "settings")
				);
	}

}
