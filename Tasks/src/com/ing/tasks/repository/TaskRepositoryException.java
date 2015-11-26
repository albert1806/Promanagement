package com.ing.tasks.repository;

/**
 * The Class TaskRepositoryException.
 *
 * @author Albert
 */
@SuppressWarnings("serial")
public class TaskRepositoryException extends Exception{
	
	/** The failed task. */
	private Task failedTask;

	/**
	 * Gets the failed task.
	 *
	 * @return the failed task
	 */
	public Task getFailedTask() {
		return failedTask;
	}
	
	/**
	 * Instantiates a new task repository exception.
	 *
	 * @param failedTask the failed task
	 */
	public TaskRepositoryException(Task failedTask){
		this.failedTask = failedTask;
	}
	
	/**
	 * Instantiates a new task repository exception.
	 *
	 * @param cause the cause
	 * @param failedTask the failed task
	 */
	public TaskRepositoryException(Throwable cause, Task failedTask){
		super(cause);
		this.failedTask = failedTask;
	}
}
