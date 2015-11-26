/**
 * 
 */
package com.ing.tasks.repository;

import java.util.List;

/**
 * The Class DBTaskRepository.
 *
 * @author Studenr
 */
public class DBTaskRepository implements TaskRepository {

	/**
	 *  Add task to DB.
	 *
	 * @param t the t
	 * @throws TaskRepositoryException the task repository exception
	 * @see com.ing.tasks.repository.TaskRepository#addTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void addTask(Task t) throws TaskRepositoryException {
		// TODO Auto-generated method stub

	}

	/**
	 * Removes the task.
	 *
	 * @param t the t
	 * @see com.ing.tasks.repository.TaskRepository#removeTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void removeTask(Task t) {
		// TODO Auto-generated method stub

	}

	/**
	 * Gets the the tasks.
	 *
	 * @return the the tasks
	 * @see com.ing.tasks.repository.TaskRepository#getTheTasks()
	 */
	@Override
	public List<Task> getTheTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Read task.
	 *
	 * @param name the name
	 * @return the task
	 * @throws TaskRepositoryException the task repository exception
	 * @see com.ing.tasks.repository.TaskRepository#readTask(java.lang.String)
	 */
	@Override
	public Task readTask(String name) throws TaskRepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Gets the nb of tasks.
	 *
	 * @return the nb of tasks
	 * @see com.ing.tasks.repository.TaskRepository#getNbOfTasks()
	 */
	@Override
	public int getNbOfTasks() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Update task.
	 *
	 * @param t the t
	 * @see com.ing.tasks.repository.TaskRepository#updateTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void updateTask(Task t) {
		// TODO Auto-generated method stub

	}

}
