package com.ing.tasks.repository;

@SuppressWarnings("serial")
public class AddTaskException extends TaskRepositoryException {

	public AddTaskException(Task failedTask) {
		super(failedTask);
	}

	public AddTaskException(Throwable cause, Task failedTask) {
		super(cause, failedTask);
	}

	@Override
	public String toString() {
		return "AddTaskException [The task added is " + getFailedTask() + "]";
	}

	
}
