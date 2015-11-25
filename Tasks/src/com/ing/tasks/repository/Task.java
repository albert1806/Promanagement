package com.ing.tasks.repository;

/**
 * Super class of all tasks: {@link Task}, {@link Meeting}, {@link Schedule}, {@link PhoneCall}
 * @author Albert
 *
 */
public class Task implements Cloneable {
	/**
	 * <i>Asta este clasa super a tuturor taskurilor</i><br/>
	 * <b>ceva bla bla </b>
	 */
	private String name;
	private String description;
	private boolean completed;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the completed
	 */
	public boolean isCompleted() {
		return completed;
	}

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
	public String toString() {
		return name + description;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
