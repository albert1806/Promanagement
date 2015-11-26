package com.ing.tasks.repository;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class PhoneCall.
 */
public class PhoneCall extends Schedule{
	
	/** The person. */
	public Person person;
	
	/**
	 * Instantiates a new phone call.
	 */
	public PhoneCall(){
		super("","",new Date());
		person = new Person("", "", 0);
	}
	
	/**
	 * Instantiates a new phone call.
	 *
	 * @param name the name
	 * @param description the description
	 * @param date the date
	 * @param person the person
	 */
	public PhoneCall(String name, String description, Date date, Person person) {
		super(name, description, date);
		this.person = person;
	}

	/* (non-Javadoc)
	 * @see com.ing.tasks.repository.Schedule#toString()
	 */
	@Override
	public String toString() {
		return super.getName() + super.getDescription() + date + person;
	}
}
