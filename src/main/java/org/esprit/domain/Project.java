package org.esprit.domain;

import java.io.File;
import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Project
 *
 */
@Entity

public class Project implements Serializable {

	   
	@Id
	private int project_id;
	private String project_name;
	private Date start_date;
	private Date delivery_date;
	private File f;
	private Etat etat;
	@OneToOne
	private Team team;
	@OneToMany
	private List<Task> tasks = new ArrayList<Task>();;
	private static final long serialVersionUID = 1L;

	public Project() {
		super();
	}   
	public int getProject_id() {
		return this.project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}   
	public String getProject_name() {
		return this.project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}   
	public Date getStart_date() {
		return this.start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}   
	public Date getDelivery_date() {
		return this.delivery_date;
	}

	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}
	public File getF() {
		return f;
	}
	public void setF(File f) {
		this.f = f;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
   
}
