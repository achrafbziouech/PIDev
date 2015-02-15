package org.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.domain.Project;

@Remote
public interface ProjectServiceRemote {
	/**
	 * 
	 * @return
	 */
	public List<Project> findAll();
	/**
	 * 
	 * @return
	 */
	public Project findBYState();


}
