package com.ing.tasks.repository;

import java.util.Date;

/**
 * @author Albert
 *
 */
public class Schedule extends Task {
	
	protected Date date;

	/**
	 * @param name
	 * @param description
	 * @param date
	 */
	public Schedule(String name, String description, Date date) {
		super(name, description);
		this.date = date;
	}
	
	@Override
	public String toString(){
		return name + description + date;
	}
}
