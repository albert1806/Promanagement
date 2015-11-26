package com.ing.tasks.repository;

/**
 * The Class AddTaskException.
 */
@SuppressWarnings("serial")
public class AddTaskException extends TaskRepositoryException {

	/**
	 * Instantiates a new adds the task exception.
	 *
	 * @param failedTask the failed task
	 */
	public AddTaskException(Task failedTask) {
		super(failedTask);
	}

	/**
	 * Instantiates a new adds the task exception.
	 *
	 * @param cause the cause
	 * @param failedTask the failed task
	 */
	public AddTaskException(Throwable cause, Task failedTask) {
		super(cause, failedTask);
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		return "AddTaskException [The task added is " + getFailedTask() + "]";
	}

	
}
