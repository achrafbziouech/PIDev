package org.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.domain.Task;



@Remote
public interface TaskManageRemote {
	/**
	 * 
	 * @param t
	 */
	public void addTask(Task t);
	/**
	 * 
	 * @param t
	 */
	public void updateTask(Task t);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Task findTask(int id);
	/**
	 * 
	 * @param t
	 */
	public void DeleteTask(Task t);
	/**
	 * 
	 * @return
	 */
	public List<Task> findAll();

}
