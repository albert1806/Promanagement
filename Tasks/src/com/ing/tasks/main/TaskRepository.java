package com.ing.tasks.main;

import com.ing.tasks.repository.AddTaskException;
import com.ing.tasks.repository.Task;
import com.ing.tasks.repository.TaskRepositoryException;

/**
 * @author Albert
 *
 */
public class TaskRepository {

	private Task[] theTasks;
	private int nbOfTasks;

	public TaskRepository() {
		theTasks = new Task[10];
		nbOfTasks = 0;
	}

	/**
	 * @param t a {@link Task} to add to repo, MUST NOT BE NULL
	 * @throws TaskRepositoryException if general error occurs
	 * @throws AddTaskException when task null
	 */
	//@deprecated Please use <b>"add()"</b> next time!;
	public void addTask(Task t) throws TaskRepositoryException {
		if (t == null) {
			 throw new AddTaskException(t);
		}
		
		if(nbOfTasks > theTasks.length-1){
			throw new TaskRepositoryException(t);
		}
		
		theTasks[nbOfTasks] = t;
		nbOfTasks++;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String message = nbOfTasks + " tasks today!";

		sb.append("Hy, Albert! ").append(message).append("\n");

		for (Task t : theTasks) {
			if (t == null) {
				break;
			}
			sb.append(t).append("\n");
		}
		return sb.toString();

		// for (int i = 0; i < nbOfTasks; i++) {
		// sb.append(theTasks[i]).append("\n");
		// }
		// return sb.toString();
	}
}
