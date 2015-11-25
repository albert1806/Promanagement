package com.ing.tasks.repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Albert
 *
 */
public class InMemoryTaskRepository implements Cloneable, TaskRepository {

	private List<Task> theTasks;
	
	public InMemoryTaskRepository() {
		theTasks = new LinkedList<>();
	}

	public int getNbOfTasks() {
		return theTasks.size();
	}

	public List<Task> getTheTasks() {
		return Collections.unmodifiableList(theTasks);
	}

	public Task readTask(String name) throws TaskRepositoryException {
		
		Task t = new Task(name, null);
		int index = theTasks.indexOf(t);
		
		if (index < 0 || index >= theTasks.size()) {
			throw new TaskRepositoryException(null);
		}
		return theTasks.get(index);
	}

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
	
	@Override
	public void updateTask(Task t) {
		//Do nothing;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		// FIXME deep clone the child task!;
	}

	
}
