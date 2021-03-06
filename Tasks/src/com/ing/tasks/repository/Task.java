package com.ing.tasks.repository;

import java.io.Serializable;

/**
 * Super class of all tasks: {@link Task}, {@link Meeting}, {@link Schedule}, {@link PhoneCall}.
 *
 * @author Albert
 */
public class Task implements Cloneable, Serializable {
	
	private static final long serialVersionUID = 1L;

	/** <i>Asta este clasa super a tuturor taskurilor</i><br/> <b>ceva bla bla </b>. */
	private String name;
	
	/** The description. */
	private String description;
	
	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	/** The completed. */
	private boolean completed;

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Checks if is completed.
	 *
	 * @return the completed
	 */
	public boolean isCompleted() {
		return completed;
	}

	/**
	 * Instantiates a new task.
	 *
	 * @param name the name
	 * @param description the description
	 */
	public Task(String name, String description) {
		this.name = name;
		this.description = description;
	}

	/**
	 * Instantiates a new task.
	 */
	public Task() {
		// this-ul de jos cheama constructoru cu parametrii de sus
		// this("","");
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name: " + name + " Description: " + description + " Completed: " + isCompleted();
	}

	/**
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Task))
			return false;
		Task other = (Task) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
