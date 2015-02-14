package org.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import org.esprit.domain.Project;

@Remote
public interface ProjectServiceRemote {
	public List<Project> findAll();
	public Project findBYState(String state);


}
