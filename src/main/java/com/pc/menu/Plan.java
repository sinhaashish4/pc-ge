package com.pc.menu;

public class Plan {
	private final Integer id;
	private final String name;

	public Plan(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}
}
