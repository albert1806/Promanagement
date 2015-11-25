package com.ing.tasks.repository;

/**
 * @author Albert
 *
 */
public class TaskRepositoryException extends Exception{
	
	private Task failedTask;

	public Task getFailedTask() {
		return failedTask;
	}
	
	public TaskRepositoryException(Task failedTask){
		this.failedTask = failedTask;
	}
	
	public TaskRepositoryException(Throwable cause, Task failedTask){
		super(cause);
		this.failedTask = failedTask;
	}
}
