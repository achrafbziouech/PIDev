package org.esprit.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.esprit.domain.Task;

/**
 * Session Bean implementation class TaskManage
 */
@Stateless
@LocalBean
public class TaskManage implements TaskManageRemote{
	@PersistenceContext(unitName="ConsolidatedWorkloadCalculation")
	private EntityManager em ;

    /**
     * Default constructor. 
     */
    public TaskManage() {
        // TODO Auto-generated constructor stub
    }

    /**
     * This methode to Add Task
     */
    @Override
	public void addTask(Task t) {
		em.persist(t);	
	}
    /**
     * this methode to update Task
     */

	@Override
	public void updateTask(Task t) {
		em.merge(t);	
	}
	/**
	 * this methode to find a task by id 
	 */
	@Override
	public Task findTask(int id) {
		Task t1 = em.find(Task.class, id); 
		return t1;
	}
	/**
	 * this method to delete a task 
	 */

	@Override
	public void DeleteTask(Task t) {
		em.remove(em.merge(t));
		
	}

}
