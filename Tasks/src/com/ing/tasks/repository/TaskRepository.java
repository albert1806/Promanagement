package com.ing.tasks.repository;

import java.util.List;

/**
 * @author Albert
 *
 */
public interface TaskRepository {
	
	/**
	 * @param t a {@link Task} to add to repo, MUST NOT BE NULL
	 * @throws TaskRepositoryExceptionif general error occurs
	 * @throws AddTaskException when task null
	 */
	public void addTask(Task t) throws TaskRepositoryException;
	
	/**
	 * @param t {@link Task}
	 */
	public void removeTask(Task t);
	
	/**
	 * @return the theTasks
	 */
	public List<Task> getTheTasks();
	
	/**
	 * Retrieve a Task at specified index if available
	 * @param name; the unique name of the task
	 * @return a {@link Task} that cannot be null
	 * @throws TaskRepositoryException
	 */
	public Task readTask(String name) throws TaskRepositoryException;
	
	/**
	 * @return the nbOfTasks
	 */
	public int getNbOfTasks();
	
	/**
	 * @param t
	 */
	public void updateTask(Task t);
}
