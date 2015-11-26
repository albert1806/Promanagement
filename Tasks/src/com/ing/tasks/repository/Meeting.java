package com.ing.tasks.repository;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class Meeting.
 *
 * @author Albert
 */
public class Meeting extends Schedule {
	
	/** The place. */
	private String place;
	
	/** The person. */
	private Person person;
	
	/**
	 * Instantiates a new meeting.
	 *
	 * @param name the name
	 * @param description the description
	 * @param date the date
	 * @param place the place
	 * @param person the person
	 */
	public Meeting(String name, String description, Date date, String place, Person person) {
		super(name, description, date);
		this.person = person;
		this.place = place;
	}
	
	/* (non-Javadoc)
	 * @see com.ing.tasks.repository.Schedule#toString()
	 */
	@Override
	public String toString(){
		return super.getName() + super.getDescription() + person + place + date;
	}
}
