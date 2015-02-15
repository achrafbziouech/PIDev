package org.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.domain.Task;



@Remote
public interface TaskServiceRemote {
	/**
	 * 
	 * @param t
	 */
	public void addtask(Task t);
	/**
	 * 
	 * @param t
	 */
	public void updatetask(Task t);
	/**
	 * 
	 * @param idtask
	 * @return
	 */
	public Task findTask(int idtask);
	/**
	 * 
	 * @param t
	 */
	public void deleteTask(Task t);
	/**
	 * 
	 * @return
	 */
	public List<Task> findAll();
	/**
	 * 
	 * @param idtask
	 * @return
	 */
	public Task findBYid(int idtask);

}
