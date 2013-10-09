package net.matt.entity;

import java.util.GregorianCalendar;

public class Task {
	
	String code, name, description;
	GregorianCalendar dateIssued, dateEnding;
	boolean completed;
	
	public Task(String code, String name, String description,
			GregorianCalendar dateIssued, GregorianCalendar dateEnding) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.dateIssued = dateIssued;
		this.dateEnding = dateEnding;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateIssued() {
		return dateIssued;
	}
	
	public GregorianCalendar getDateEnding() {
		return dateEnding;
	}
	
	public boolean isCompleted() {
		return completed;
	}
	
	
}
