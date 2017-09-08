package com.pc.menu;

import java.util.List;

public class PlanMenus {
	private final Plan plan;
	private final List<Menu> menus;

	public PlanMenus(Plan plan, List<Menu> menus) {
		super();
		this.plan = plan;
		this.menus = menus;
	}

	public Plan getPlan() {
		return plan;
	}

	public List<Menu> getMenus() {
		return menus;
	}
}
