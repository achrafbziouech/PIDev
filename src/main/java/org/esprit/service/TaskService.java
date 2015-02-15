package org.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.esprit.domain.Task;


/**
 * Session Bean implementation class TaskService
 */
@Stateless
@LocalBean
public class TaskService implements TaskServiceRemote {
	@PersistenceContext
	EntityManager em;

    /**
     * Default constructor. 
     */
    public TaskService() {
        // TODO Auto-generated constructor stub
    }
    /**
     * this method to add a task
     */

	@Override
	public void addtask(Task t) {
		// TODO Auto-generated method stub
		em.persist(t);
		
	}
	/**
	 * this method to update a task
	 */
	@Override
	public void updatetask(Task t) {
		// TODO Auto-generated method stub
		em.merge(t);
		
	}
	/**
	 * this method to find a task 
	 */

	@Override
	public Task findTask(int idtask) {
		// TODO Auto-generated method stub
		return em.find(Task.class,idtask );
	}
	/**
	 * this method to delete a task
	 */

	@Override
	public void deleteTask(Task t) {
		// TODO Auto-generated method stub
		em.remove(em.find(Task.class, t.getId()));
		
	}
	/**
	 * this method to display all task
	 */

	@Override
	public List<Task> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("Select t from t_task t ",Task.class).getResultList();
	}

	/**
	 * 
	 */
	@Override
	public Task findBYid(int idtask) {
		// TODO Auto-generated method stub
		String jpq1="Select p from t_task p where p.id =:param";
		Query query =em.createQuery(jpq1);
		query.setParameter("param", idtask);
		
		return (Task) query.getSingleResult();
	}

}
