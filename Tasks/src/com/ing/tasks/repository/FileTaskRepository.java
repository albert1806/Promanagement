/**
 * 
 */
package com.ing.tasks.repository;

import java.util.List;

/**
 * @author Studenr
 *
 */
public class FileTaskRepository implements TaskRepository {

	/**
	 * @see com.ing.tasks.repository.TaskRepository#addTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void addTask(Task t) throws TaskRepositoryException {
		// TODO Auto-generated method stub

	}

	/** 
	 * @see com.ing.tasks.repository.TaskRepository#removeTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void removeTask(Task t) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.ing.tasks.repository.TaskRepository#getTheTasks()
	 */
	@Override
	public List<Task> getTheTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.ing.tasks.repository.TaskRepository#readTask(java.lang.String)
	 */
	@Override
	public Task readTask(String name) throws TaskRepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.ing.tasks.repository.TaskRepository#getNbOfTasks()
	 */
	@Override
	public int getNbOfTasks() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see com.ing.tasks.repository.TaskRepository#updateTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void updateTask(Task t) {
		// TODO Auto-generated method stub

	}

}
