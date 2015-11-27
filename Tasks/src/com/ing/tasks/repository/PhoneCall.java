package com.ing.tasks.repository;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class PhoneCall.
 */
public class PhoneCall extends Schedule implements Runnable{
	
	/** The person. */
	public Person person;
	
	private boolean callFinished;
	
	/**
	 * @return the callFinished
	 */
	public boolean isCallFinished() {
		return callFinished;
	}

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

	/**
	* @see com.ing.tasks.repository.Schedule#toString()
	*/
	@Override
	public String toString() {
		return super.getName() + super.getDescription() + date + person;
	}

	
	@Override
	public void run() {
		
		callFinished = false;
		
		if(person == null){
			System.out.println("No one to call");
			return;
		}
		for(int i=0; i<=5; i++){
			System.out.println("Calling " + person.name + "at number: " + person.phone);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		callFinished = true;
	}
}
