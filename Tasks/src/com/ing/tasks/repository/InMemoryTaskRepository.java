package com.ing.tasks.repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The Class InMemoryTaskRepository.
 *
 * @author Albert
 */
public class InMemoryTaskRepository implements Cloneable, TaskRepository {

	/** The tasks. */
	private List<Task> theTasks;
	
	/**
	 * Instantiates a new in memory task repository.
	 */
	public InMemoryTaskRepository() {
		theTasks = new LinkedList<>();
	}

	/* (non-Javadoc)
	 * @see com.ing.tasks.repository.TaskRepository#getNbOfTasks()
	 */
	public int getNbOfTasks() {
		return theTasks.size();
	}

	/* (non-Javadoc)
	 * @see com.ing.tasks.repository.TaskRepository#getTheTasks()
	 */
	public List<Task> getTheTasks() {
		return Collections.unmodifiableList(theTasks);
	}

	/* (non-Javadoc)
	 * @see com.ing.tasks.repository.TaskRepository#readTask(java.lang.String)
	 */
	public Task readTask(String name) throws TaskRepositoryException {
		
		Task t = new Task(name, null);
		int index = theTasks.indexOf(t);
		
		if (index < 0 || index >= theTasks.size()) {
			throw new TaskRepositoryException(null);
		}
		return theTasks.get(index);
	}

	/* (non-Javadoc)
	 * @see com.ing.tasks.repository.TaskRepository#addTask(com.ing.tasks.repository.Task)
	 */
	// @deprecated Please use <b>"add()"</b> next time!;
	public void addTask(Task t) throws TaskRepositoryException {
		if (t == null) {
			throw new AddTaskException(t);
		}
		theTasks.add(t);
	}

	/* (non-Javadoc)
	 * @see com.ing.tasks.repository.TaskRepository#removeTask(com.ing.tasks.repository.Task)
	 */
	public void removeTask(Task t){
		theTasks.remove(t);
	}
	
	/* (non-Javadoc)
	 * @see com.ing.tasks.repository.TaskRepository#updateTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void updateTask(Task t) {
		//Do nothing;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
//		Needed todo deepclone, not needed eanymore because we use generics
	}

	
}
