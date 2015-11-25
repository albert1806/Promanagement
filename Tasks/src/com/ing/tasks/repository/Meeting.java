package com.ing.tasks.repository;

import java.util.Date;

/**
 * @author Albert
 *
 */
public class Meeting extends Schedule {
	
	private String place;
	private Person person;
	
	/**
	 * @param name
	 * @param description
	 * @param date
	 */
	public Meeting(String name, String description, Date date, String place, Person person) {
		super(name, description, date);
		this.person = person;
		this.place = place;
	}
	
	@Override
	public String toString(){
		return name + description + person + place + date;
	}
}
