package com.ing.tasks.repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Create object of type {@link TaskRepository}.
 *
 * @author Albert
 */
public class RepositoryFactory {
	
	/**
	 * The Enum RepoType.
	 */
	public enum RepoType {
		
		/** The type memory. */
		TYPE_MEMORY,
		
		/** The type file. */
		TYPE_FILE,
		
		/** The type db. */
		TYPE_DB;
	}

	/** The repos. */
	private  Map<RepoType, TaskRepository> repos = new HashMap<>();
	
	/** The instance. */
	private static RepositoryFactory theInstance = new RepositoryFactory();

	/**
	 * Instantiates a new repository factory.
	 */
	private RepositoryFactory() {
		repos.put(RepoType.TYPE_MEMORY, new InMemoryTaskRepository());
		repos.put(RepoType.TYPE_FILE, new FileTaskRepository());
		repos.put(RepoType.TYPE_DB, new DBTaskRepository());
	}

	/**
	 * Creates a new Repository object.
	 *
	 * @param type the type
	 * @return the task repository
	 */
	public TaskRepository createRepository(RepoType type) {
		return repos.get(type);
	}

	/**
	 * Instance.
	 *
	 * @return the repository factory
	 */
	public static RepositoryFactory instance() {
		return theInstance;
	}

}
