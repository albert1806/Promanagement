package com.ing.tasks.repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

/**
 * The Class FileTaskRepository.
 *
 * @author Studenr
 */
public class FileTaskRepository implements TaskRepository {

	private final String FILE_NAME = "tasks.repository";

	/**
	 * Adds the task.
	 *
	 * @param t
	 * @throws TaskRepositoryException the task repository exception
	 * @see com.ing.tasks.repository.TaskRepository#addTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void addTask(Task t) throws TaskRepositoryException {
		FileOutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream(FILE_NAME, false);
			oos = new ObjectOutputStream(os);
			oos.writeObject(t);
		} catch (IOException e) {
			throw new TaskRepositoryException(e, t);
		} finally {
			
			try {
				oos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Gets the the tasks.
	 *
	 * @return the the tasks
	 * @see com.ing.tasks.repository.TaskRepository#getTheTasks()
	 */
	@Override
	public List<Task> getTheTasks() {

		List<Task> result = new LinkedList<>();
		
		try(FileInputStream is = new FileInputStream(FILE_NAME)) {

			ObjectInputStream ois = new ObjectInputStream(is);

			while (true) {
				Task t = (Task) ois.readObject();
				if (t == null) {
					break;
				}
				result.add(t);
			}
			return result;

		} catch (IOException | ClassNotFoundException e) { // this is Java >=7
			e.printStackTrace();
			return result;
		}
	}

	/**
	 * @param t
	 * @see com.ing.tasks.repository.TaskRepository#removeTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void removeTask(Task t) {

	}

	/**
	 * Read task.
	 *
	 * @param name
	 *            the name
	 * @return the task
	 * @throws TaskRepositoryException
	 *             the task repository exception
	 * @see com.ing.tasks.repository.TaskRepository#readTask(java.lang.String)
	 */
	@Override
	public Task readTask(String name) throws TaskRepositoryException {
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
		return 0;
	}

	/**
	 * Update task.
	 *
	 * @param t
	 *            the t
	 * @see com.ing.tasks.repository.TaskRepository#updateTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void updateTask(Task t) {
	}

}
