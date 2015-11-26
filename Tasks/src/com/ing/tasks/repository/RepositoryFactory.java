package com.ing.tasks.repository;

/**
 * Create object of type {@link TaskRepository}
 * 
 * @author Albert
 */
public class RepositoryFactory {

	private static final InMemoryTaskRepository IN_MEMORY_TASK_REPOSITORY = new InMemoryTaskRepository();
	private static final FileTaskRepository FILE_TASK_REPOSITORY = new FileTaskRepository();
	private static final DBTaskRepository DB_TASK_REPOSITORY = new DBTaskRepository();

	private static RepositoryFactory theInstance = new RepositoryFactory();

	public static final int TYPE_MEMORY = 0;
	public static final int TYPE_FILE = 1;
	public static final int TYPE_DB = 2;

	private RepositoryFactory() {

	}

	public TaskRepository createRepository(int type) {
		switch (type) {
		case 0:
			return IN_MEMORY_TASK_REPOSITORY;
		case 1:
			return FILE_TASK_REPOSITORY;
		case 2:
			return DB_TASK_REPOSITORY;
		default:
			return IN_MEMORY_TASK_REPOSITORY; // TODO throw exception
		}
	}

	public static RepositoryFactory instance() {

		return theInstance;
	}

}
