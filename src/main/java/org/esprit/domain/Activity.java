package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Activity   
 *
 */
@Entity

public class Activity implements Serializable {

	   
	@Id
	private int activity_id;
	private String activity_name;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name = "Admin_id_fk")
	private Administrator Admin;
	
	public Activity() {
		super();
	}   
	public int getActivity_id() {
		return this.activity_id;
	}

	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}   
	public String getActivity_name() {
		return this.activity_name;
	}

	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}
   
}
