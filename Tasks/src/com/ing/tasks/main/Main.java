package com.ing.tasks.main;

import java.util.Date;

import com.ing.tasks.repository.AddTaskException;
import com.ing.tasks.repository.Meeting;
import com.ing.tasks.repository.Person;
import com.ing.tasks.repository.PhoneCall;
import com.ing.tasks.repository.RepositoryFactory;
import com.ing.tasks.repository.RepositoryFactory.RepoType;
import com.ing.tasks.repository.Schedule;
import com.ing.tasks.repository.Task;
import com.ing.tasks.repository.TaskInformationDisplayer;
import com.ing.tasks.repository.TaskRepository;
import com.ing.tasks.repository.TaskRepositoryException;

import static com.ing.tasks.repository.RepositoryFactory.RepoType.*; //Enum in interiorul RepositoryFactory
//static importa campurile statice si nu e nev sa mai facem RepoType.blabla

/**
 * The Class Main.
 *
 * @author Albert
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		RepoType type = TYPE_MEMORY;
		System.out.println("Creating repo of type: " + type);
		TaskRepository  repo = RepositoryFactory.instance().createRepository(type);
		TaskInformationDisplayer.printTasks(repo);

		try {
			repo.addTask(new Task("Factura de platit", " la Enel"));
			repo.addTask(new Schedule("La o bere ", " Beraria H ", new Date()));
			repo.addTask(new Meeting("Aquamarin ", " Planning ", new Date()," ING Crystal Tower ", new Person(" Mihai ", "323232", 21)));
			PhoneCall theCall = new PhoneCall("Call ", " reminder sa il suni ",new Date(), new Person(" Vlad ", "0720092075", 21));
			repo.addTask(theCall);
			
			Thread callThread = new Thread(theCall,"Caller Thread");
			callThread.start();
			try {
				callThread.join();// or join(123) care asteapta maxim 123 dupa thread
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Finished calling: " + theCall.isCallFinished());
			
		} catch (AddTaskException e) {
			e.printStackTrace();

		} catch (TaskRepositoryException e) {
			System.err.println("FATAL REPOSITORYE ERR" + e);
			System.exit(-1);
		}

		TaskInformationDisplayer.printTasks(repo);
	}
}
