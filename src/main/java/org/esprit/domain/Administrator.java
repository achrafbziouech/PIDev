package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity

public class Administrator implements Serializable {

	@Id
	private int admin_id;
	private String first_name;
	private String last_name;
	private String Login_admin;
	private String password_admin;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "admin")
	private List<Employee> employees;

	@OneToMany(mappedBy = "Admin")
	private List<Activity> Activities;
	
	public Administrator() {
		super();
	}   
	public int getAdmin_id() {
		return this.admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}   
	public String getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}   
	public String getLast_name() {
		return this.last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}   
	public String getLogin_admin() {
		return this.Login_admin;
	}

	public void setLogin_admin(String Login_admin) {
		this.Login_admin = Login_admin;
	}   
	public String getPassword_admin() {
		return this.password_admin;
	}

	public void setPassword_admin(String password_admin) {
		this.password_admin = password_admin;
	}
   
}
