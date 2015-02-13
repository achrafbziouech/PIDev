package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Training_session
 *
 */
@Entity

public class Training_session implements Serializable {

	   
	@Id
	private int training_session_id;
	private String training_session_name;
	private String training_session_type;
	private String training_session_duration;
	private static final long serialVersionUID = 1L;
	@ManyToMany
    private List<Trainer> trainers ;
    
	public Training_session() {
		super();
	}   
	public int getTraining_session_id() {
		return this.training_session_id;
	}

	public void setTraining_session_id(int training_session_id) {
		this.training_session_id = training_session_id;
	}   
	public String getTraining_session_name() {
		return this.training_session_name;
	}

	public void setTraining_session_name(String training_session_name) {
		this.training_session_name = training_session_name;
	}   
	public String getTraining_session_type() {
		return this.training_session_type;
	}

	public void setTraining_session_type(String training_session_type) {
		this.training_session_type = training_session_type;
	}   
	public String getTraining_session_duration() {
		return this.training_session_duration;
	}

	public void setTraining_session_duration(String training_session_duration) {
		this.training_session_duration = training_session_duration;
	}
   
}
