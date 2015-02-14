package org.esprit.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TaskService
 */
@Stateless
@LocalBean
public class TaskService implements TaskServiceRemote {

    /**
     * Default constructor. 
     */
    public TaskService() {
        // TODO Auto-generated constructor stub
    }

}
