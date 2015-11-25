package com.ing.tasks.main;

import com.ing.tasks.repository.AddTaskException;
import com.ing.tasks.repository.Task;
import com.ing.tasks.repository.TaskRepositoryException;

/**
 * @author Albert
 *
 */
public class TaskRepository implements Cloneable{

	private Task[] theTasks;
	private int nbOfTasks;
	
	/**
	 * @return the nbOfTasks
	 */
	public int getNbOfTasks() {
		return nbOfTasks;
	}
	
	/**
	 * @return the theTasks
	 */
	public Task[] getTheTasks() {
		return theTasks.clone(); //FIXME the clone method down below, must clone deep
	}
	
	/**
	 * Retrieve a Task at specified index if available
	 * @param index a numeric index of the list of tasks; must be between <b>[0 ; {@link #getNbOfTasks()})</b>
	 * @return a {@link Task} that cannot be null
	 * @throws TaskRepositoryException 
	 */
	public Task getTheTasks(int index) throws TaskRepositoryException{
		if(index<0 || index>=nbOfTasks){
			throw new TaskRepositoryException(null);
		}
		return theTasks[index];
	}
	
	protected TaskRepository() {
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

//		for (Task t : theTasks) {
//			if (t == null) {
//				break;
//			}
//			sb.append(t).append("\n");
//		}
		return sb.toString();

		// for (int i = 0; i < nbOfTasks; i++) {
		// sb.append(theTasks[i]).append("\n");
		// }
		// return sb.toString();
	}
	
	//Nu e folosit pentru ca am ales alta metoda mai putin consumatoare de memorie a.k.a. getter pt completed
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		//FIXME deep clone the child task!;
	}
}
