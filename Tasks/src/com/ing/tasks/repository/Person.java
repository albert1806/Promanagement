package com.ing.tasks.repository;

import java.io.Serializable;

/**
 * The Class Person.
 *
 * @author Albert
 */
public class Person implements Serializable {

	/** The name. */
	String name;
	
	/** The phone. */
	String phone;
	
	/** The age. */
	private int age;
	
	public Person(){
		
	}
	/**
	 * Instantiates a new person.
	 *
	 * @param name the name
	 * @param phone the phone
	 * @param age the age
	 */
	public Person(String name, String phone, int age){
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name+" "+ phone+" "+ age;
	}
	
	
}
