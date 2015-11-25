package com.ing.tasks.repository;

import java.util.Date;

public class PhoneCall extends Schedule {
	public Person person;
	
	public PhoneCall(){
		super("","",new Date());
		person = new Person("", "", 0);
	}
	
	public PhoneCall(String name, String description, Date date, Person person) {
		super(name, description, date);
		this.person = person;
	}

	@Override
	public String toString() {
		return super.getName() + super.getDescription() + date + person;
	}
}
