package com.ing.tasks.repository;

/**
 * @author Albert
 *
 */
public class Task {
	protected String name;
	protected String description;
	@SuppressWarnings("unused")
	private boolean completed;
	
	/**
	 * @param name
	 * @param description
	 */
	public Task(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Task() {
		// this-ul de jos cheama constructoru cu parametrii de sus
		// this("",""); 
	}
	
	@Override
	public String toString(){
		return name + description;
	}
}
