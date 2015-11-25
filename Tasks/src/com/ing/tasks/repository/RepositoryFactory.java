package com.ing.tasks.repository;

public enum RepositoryFactory {
	IN_MEMORY_TASK_REPOSITORY;
	
	public TaskRepository createRepository(){
		return new InMemoryTaskRepository();
	} 
}
