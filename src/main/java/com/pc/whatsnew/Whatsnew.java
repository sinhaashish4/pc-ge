package com.pc.whatsnew;

public class Whatsnew {
	private String name;
	private String details;
	private String link;
	public Whatsnew(String name, String details, String link) {
		super();
		this.name = name;
		this.details = details;
		this.link = link;
	}
	public String getName() {
		return name;
	}
	public String getDetails() {
		return details;
	}
	public String getLink() {
		return link;
	}
	
}
