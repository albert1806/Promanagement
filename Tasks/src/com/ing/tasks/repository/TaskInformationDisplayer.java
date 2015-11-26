package com.ing.tasks.repository;


/**
 * The Class TaskInformationDisplayer.
 */
public class TaskInformationDisplayer {
	
	/**
	 * Display single task.
	 *
	 * @param theTask the the task
	 */
	private static void displaySingleTask(Task theTask) {
		 System.out.print(theTask.isCompleted() ? "Done! " : "ToDo! ");
//		if (theTask.isCompleted()) {
//			System.out.print("DONE! ");
//		} else {
//			System.out.print("ToDo! ");
//		}
		System.out.println(theTask);
	}
	
	/**
	 * Total tasks.
	 *
	 * @param repo the repo
	 */
	private static void totalTasks(TaskRepository repo){
		StringBuilder sb = new StringBuilder();
		String message = repo.getNbOfTasks() + " tasks today!";

		System.out.println(sb.append("Hy, Albert! ").append(message).append("\n"));
	}
	
	/**
	 * Prints the tasks.
	 *
	 * @param repo the repo
	 */
	public static void printTasks(final TaskRepository repo) {

		if (repo == null) {
			System.out.println("No repository!");
			return;
		}
		
		totalTasks(repo);
		
		for (Task t : repo.getTheTasks()) {
			displaySingleTask(t);
		}

	}
}
