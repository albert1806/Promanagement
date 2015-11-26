package com.ing.tasks.repository;

import java.util.Date;

/**
 * The Class Schedule.
 *
 * @author Albert
 */
public class Schedule extends Task {
	
	/** The date. */
	protected Date date;

	/**
	 * Instantiates a new schedule.
	 *
	 * @param name the name
	 * @param description the description
	 * @param date the date
	 */
	public Schedule(String name, String description, Date date) {
		super(name, description);
		this.date = date;
	}
	
	/* (non-Javadoc)
	 * @see com.ing.tasks.repository.Task#toString()
	 */
	@Override
	public String toString(){
		return super.getName() + super.getDescription() + date;
	}
}
