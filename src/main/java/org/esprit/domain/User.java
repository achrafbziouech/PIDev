package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	   
	@Id
	private int user_id;
	private String first_name;
	private String last_name;
	private String home_address;
	private String email_address;
	private long telephone_number;
	private String login;
	private String password;
	private long cin_number;
	private String post;
	private Date datenaissance;
	private Date dateofadmission;
	@ManyToOne
	private Team team;
	
	private static final long serialVersionUID = 1L;
		
	@ManyToOne
	@JoinColumn(name = "Admin_id_fk")
	private Administrator Admin;
	public User() {
		super();
	}   
	public int getUser_id() {
		return this.user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	public String getHome_address() {
		return this.home_address;
	}

	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}   
	public String getEmail_address() {
		return this.email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}   
	public long getTelephone_number() {
		return this.telephone_number;
	}

	public void setTelephone_number(long telephone_number) {
		this.telephone_number = telephone_number;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public long getCin_number() {
		return this.cin_number;
	}

	public void setCin_number(long cin_number) {
		this.cin_number = cin_number;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public Date getDateofadmission() {
		return dateofadmission;
	}
	public void setDateofadmission(Date dateofadmission) {
		this.dateofadmission = dateofadmission;
	}
   
}
