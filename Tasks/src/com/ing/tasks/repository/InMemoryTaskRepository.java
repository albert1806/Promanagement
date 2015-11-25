package com.ing.tasks.repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Albert
 *
 */
public class InMemoryTaskRepository implements Cloneable {

	private List<Task> theTasks;
	
	public InMemoryTaskRepository() {
		theTasks = new LinkedList<>();
	}

	/**
	 * @return the nbOfTasks
	 */
	public int getNbOfTasks() {
		return theTasks.size();
	}

	/**
	 * @return the theTasks
	 */
	public List<Task> getTheTasks() {
		return Collections.unmodifiableList(theTasks);
	}

	/**
	 * Retrieve a Task at specified index if available
	 * @param index a numeric index of the list of tasks; must be between <b>[0 ; {@link #getNbOfTasks()})</b>
	 * @return a {@link Task} that cannot be null
	 * @throws TaskRepositoryException
	 */
	public Task getTheTasks(int index) throws TaskRepositoryException {
		if (index < 0 || index >= theTasks.size()) {
			throw new TaskRepositoryException(null);
		}
		return theTasks.get(index);
	}

	/**
	 * @param t a {@link Task} to add to repo, MUST NOT BE NULL
	 * @throws TaskRepositoryExceptionif general error occurs
	 * @throws AddTaskException
	 *             when task null
	 */
	// @deprecated Please use <b>"add()"</b> next time!;
	public void addTask(Task t) throws TaskRepositoryException {
		if (t == null) {
			throw new AddTaskException(t);
		}
		theTasks.add(t);
	}

	public void removeTask(Task t){
		theTasks.remove(t);
	}
	
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		String message = getNbOfTasks() + " tasks today!";
//
//		sb.append("Hy, Albert! ").append(message).append("\n");
//
//		for (Task t : theTasks) {
//			sb.append(t).append("\n");
//		}
//		return sb.toString();
//	}

	// Nu e folosit pentru ca am ales alta metoda mai putin consumatoare de
	// memorie a.k.a. getter pt completed
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		// FIXME deep clone the child task!;
	}
}
