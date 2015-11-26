package com.ing.tasks.repository;

import java.util.List;

/**
 * The Interface TaskRepository.
 *
 * @author Albert
 */
public interface TaskRepository {
	
	/**
	 * Adds the task.
	 *
	 * @param t a {@link Task} to add to repo, MUST NOT BE NULL
	 * @throws TaskRepositoryException the task repository exception
	 */
	public void addTask(Task t) throws TaskRepositoryException;
	
	/**
	 * Removes the task.
	 *
	 * @param t {@link Task}
	 */
	public void removeTask(Task t);
	
	/**
	 * Gets the the tasks.
	 *
	 * @return the theTasks
	 */
	public List<Task> getTheTasks();
	
	/**
	 * Retrieve a Task at specified index if available.
	 *
	 * @param name the name
	 * @return a {@link Task} that cannot be null
	 * @throws TaskRepositoryException the task repository exception
	 */
	public Task readTask(String name) throws TaskRepositoryException;
	
	/**
	 * Gets the nb of tasks.
	 *
	 * @return the nbOfTasks
	 */
	public int getNbOfTasks();
	
	/**
	 * Update task.
	 *
	 * @param t the t
	 */
	public void updateTask(Task t);
}
