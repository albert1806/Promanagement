package com.ing.tasks.repository;


public class TaskInformationDisplayer {
	
	/**
	 * @param theTask
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
	
	private static void totalTasks(TaskRepository repo){
		StringBuilder sb = new StringBuilder();
		String message = repo.getNbOfTasks() + " tasks today!";

		System.out.println(sb.append("Hy, Albert! ").append(message).append("\n"));
	}
	
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
