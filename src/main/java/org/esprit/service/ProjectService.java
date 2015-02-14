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

	@Override
	public List<Project> findAll() {
		return em.createQuery("Select p from Project_t p ",Project.class).getResultList();
	}

	@Override
	public Project findBYState(String state) {
		String jpq1="Select p from Project_t p where p.state =:param";
		Query query =em.createQuery(jpq1);
		query.setParameter("param", state);
		
		return (Project) query.getSingleResult();
	}

}
