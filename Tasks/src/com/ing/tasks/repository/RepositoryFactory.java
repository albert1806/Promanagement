package com.ing.tasks.repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Create object of type {@link TaskRepository}
 * 
 * @author Albert
 */
public class RepositoryFactory {
	
	public enum RepoType {
		TYPE_MEMORY,
		TYPE_FILE,
		TYPE_DB;
	}

	private  Map<RepoType, TaskRepository> repos = new HashMap<>();
	
	private static RepositoryFactory theInstance = new RepositoryFactory();

	private RepositoryFactory() {
		repos.put(RepoType.TYPE_MEMORY, new InMemoryTaskRepository());
		repos.put(RepoType.TYPE_FILE, new FileTaskRepository());
		repos.put(RepoType.TYPE_DB, new DBTaskRepository());
	}

	public TaskRepository createRepository(RepoType type) {
		return repos.get(type);
	}

	public static RepositoryFactory instance() {
		return theInstance;
	}

}
