package com.ing.tasks.main;

import java.util.Date;

import com.ing.tasks.repository.AddTaskException;
import com.ing.tasks.repository.Meeting;
import com.ing.tasks.repository.Person;
import com.ing.tasks.repository.PhoneCall;
import com.ing.tasks.repository.RepositoryFactory;
import com.ing.tasks.repository.Schedule;
import com.ing.tasks.repository.Task;
import com.ing.tasks.repository.TaskInformationDisplayer;
import com.ing.tasks.repository.TaskRepository;
import com.ing.tasks.repository.TaskRepositoryException;
import com.ing.tasks.repository.deprecated.RepositoryFactory2;

/**
 * @author Albert
 *
 */
public class Main {

	public static void main(String[] args) {
		TaskRepository  repo = RepositoryFactory.IN_MEMORY_TASK_REPOSITORY.createRepository();
		TaskInformationDisplayer.printTasks(repo);

		try {
			repo.addTask(new Task("Factura de platit", " la Enel"));
			repo.addTask(new Schedule("La o bere ", " Beraria H ", new Date()));
			repo.addTask(new Meeting("Aquamarin ", " Planning ", new Date()," ING Crystal Tower ", new Person(" Mihai ", "323232", 21)));
			repo.addTask(new PhoneCall("Meeting ", " reminder pentru maine ",new Date(), new Person(" Vlad ", "0720092075", 21)));
//			repo.addTask(null);
			
		} catch (AddTaskException e) {
			e.printStackTrace();

		} catch (TaskRepositoryException e) {
			System.err.println("FATAL REPOSITORYE ERR" + e);
			System.exit(-1);
		}

		TaskInformationDisplayer.printTasks(repo);
	}
}
