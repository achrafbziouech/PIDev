package org.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.domain.Task;



@Remote
public interface TaskServiceRemote {
	public void addtask(Task t);
	public void updatetask(Task t);
	public Task findTask(int idtask);
	public void deleteTask(Task t);
	public List<Task> findAll();
	public Task findBYid(int idtask);

}
