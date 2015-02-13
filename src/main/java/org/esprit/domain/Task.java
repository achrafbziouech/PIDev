package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Task
 *
 */
@Entity

public class Task implements Serializable {


	@EmbeddedId
	private TaskId taskid;	   
	private String task_name;
	private String duration;
	@ManyToOne
	@JoinColumn(name="idteam", insertable=false,updatable=false)
	private Team teams;  
	@ManyToOne
	@JoinColumn(name="idproject", insertable=false,updatable=false)
	private Project projects;
	private static final long serialVersionUID = 1L;
/**
 * 
 */
	@ManyToOne
	@JoinColumn(name="project_id",insertable=false,updatable=false)
	private Project project;
	
	@ManyToOne
	@JoinColumn(name="team_id",insertable=false,updatable=false)
	private Team team;
	
	public Task() {
		super();
	}   
	

	   
	public String getTask_name() {
		return this.task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}   
	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
   
}
