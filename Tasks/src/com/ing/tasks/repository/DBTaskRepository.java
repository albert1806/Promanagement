/**
 * 
 */
package com.ing.tasks.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * The Class DBTaskRepository.
 *
 * @author Studenr
 */
public class DBTaskRepository implements TaskRepository {

	/**
	 * Add task to DB.
	 *
	 * @param t
	 *            the t
	 * @throws TaskRepositoryException
	 *             the task repository exception
	 * @see com.ing.tasks.repository.TaskRepository#addTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void addTask(Task t) throws TaskRepositoryException {
		// TODO Auto-generated method stub

	}

	/**
	 * Removes the task.
	 *
	 * @param t
	 *            the t
	 * @see com.ing.tasks.repository.TaskRepository#removeTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void removeTask(Task t) {
		// TODO Auto-generated method stub

	}

	/**
	 * Gets the the tasks.
	 *
	 * @return the the tasks
	 * @see com.ing.tasks.repository.TaskRepository#getTheTasks()
	 */
	@Override
	public List<Task> getTheTasks() {

		List<Task> result = new LinkedList<>();
		Connection conn = null;

		try {
			// load driver
			Class.forName("org.hsqldb.jdbcDriver").newInstance();
			/*
			 * creaza un obiect, in constructor se inregistreaza driveru
			 * etc.etc. Multe drivere nu a nevoie de asa ceva ca au metoda
			 * statica care face asta
			 */
			// create connection
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/"/*url*/, "SA"/*username*/,""/*parola*/);
			// load data in loop
			String filter = "";
			PreparedStatement st = conn.prepareStatement("SELECT * FROM TASK WHERE name <> ? ");
			st.setString(1, filter);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String description = rs.getString("description");
				boolean completed = rs.getBoolean("completed");

				Task t = new Task(name, description);
				t.setCompleted(completed);

				result.add(t);
			}

		} catch (Exception e) { // Nu prinde niciodata in productie cu Exception
			e.printStackTrace();
		} finally {
			// close connection
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * Read task.
	 *
	 * @param name
	 *            the name
	 * @return the task
	 * @throws TaskRepositoryException
	 *             the task repository exception
	 * @see com.ing.tasks.repository.TaskRepository#readTask(java.lang.String)
	 */
	@Override
	public Task readTask(String name) throws TaskRepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Gets the nb of tasks.
	 *
	 * @return the nb of tasks
	 * @see com.ing.tasks.repository.TaskRepository#getNbOfTasks()
	 */
	@Override
	public int getNbOfTasks() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Update task.
	 *
	 * @param t
	 *            the t
	 * @see com.ing.tasks.repository.TaskRepository#updateTask(com.ing.tasks.repository.Task)
	 */
	@Override
	public void updateTask(Task t) {
		// TODO Auto-generated method stub

	}

}
