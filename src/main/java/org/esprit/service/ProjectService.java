package org.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.esprit.domain.Project;


/**
 * Session Bean implementation class ProjectService
 */
@Stateless
@LocalBean
public class ProjectService implements ProjectServiceRemote {
	
	@PersistenceContext
	EntityManager em;

    /**
     * Default constructor. 
     */
    public ProjectService() {
        // TODO Auto-generated constructor stub
    }
    /**
     * this method to find all project
     */

	@Override
	public List<Project> findAll() {
		return em.createQuery("Select p from t_Project p ",Project.class).getResultList();
	}
	/**
	 * this method to find all project of state initial
	 */

	@Override
	public Project findBYState() {
		String jpq1="Select p from t_project p where p.state =:param";
		Query query =em.createQuery(jpq1);
		query.setParameter("param", "initial");
		
		return (Project) query.getSingleResult();
	}

}
