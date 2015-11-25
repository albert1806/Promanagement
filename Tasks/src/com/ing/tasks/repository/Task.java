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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
