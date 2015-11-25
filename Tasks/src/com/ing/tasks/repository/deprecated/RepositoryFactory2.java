	package com.ing.tasks.repository.deprecated;

import com.ing.tasks.repository.InMemoryTaskRepository;
import com.ing.tasks.repository.TaskRepository;

/**
 * Create object of type {@link TaskRepository}
 * @author Albert
 * @deprecated Using Enum for Factory with singleton
 */
public class RepositoryFactory2 {

	private static final InMemoryTaskRepository IN_MEMORY_TASK_REPOSITORY = new InMemoryTaskRepository();
	private static RepositoryFactory2 theInstance = new RepositoryFactory2();
	
	private RepositoryFactory2(){
		
	}

	public static TaskRepository createRepository(){
		return IN_MEMORY_TASK_REPOSITORY;
	} 
	
	public static RepositoryFactory2 instance(){
		
		return theInstance;
	}
	
}
