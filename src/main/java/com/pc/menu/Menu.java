package com.pc.menu;

public class Menu {
	private final Integer id;
	private final String name;
	private final String mappingUrl;
	private final String iconName;

	public Menu(Integer id, String name, String mappingUrl, String iconName) {
		super();
		this.id = id;
		this.name = name;
		this.mappingUrl = mappingUrl;
		this.iconName = iconName;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMappingUrl() {
		return mappingUrl;
	}

	public String getIconName() {
		return iconName;
	}
}
