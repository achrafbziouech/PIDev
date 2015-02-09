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

	   
	@Id
	private int task_id;
	private String task_name;
	private String duration;
	private static final long serialVersionUID = 1L;

	public Task() {
		super();
	}   
	public int getTask_id() {
		return this.task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
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
