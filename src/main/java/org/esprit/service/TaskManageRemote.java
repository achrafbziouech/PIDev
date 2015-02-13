package org.esprit.service;

import javax.ejb.Remote;

import org.esprit.domain.Task;

@Remote
public interface TaskManageRemote {
	public void addTask(Task t);
	public void updateTask(Task t);
	public Task findTask(int id);
	public void DeleteTask(Task t);

}
