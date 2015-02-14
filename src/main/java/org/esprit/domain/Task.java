package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Task
 *
 */
@Entity
@Table(name="t_task")
public class Task implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private int id;
	private Project project;
	private String description;
	private Date deadLine;
	private Date startDate;
	private State state;
	
	public Task() {
		super();
	}   
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}    
		
	public String getDescription() {return this.description;}
	public void setDescription(String description) {this.description = description;}   
	   
	public Date getDeadLine() {return this.deadLine;}
	public void setDeadLine(Date deadLine) {this.deadLine = deadLine;}   
	
	public Date getStartDate() {return this.startDate;}
	public void setStartDate(Date startDate) {this.startDate = startDate;}

	@ManyToOne
	public Project getProject() {return project;}
	public void setProject(Project project) {this.project = project;}
	

	public State getState() {return state;}
	public void setState(State state) {this.state = state;}   
		
}