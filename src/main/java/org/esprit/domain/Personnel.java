package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
public class Personnel implements Serializable {
	

	private static final long serialVersionUID = 1L;
	//attributs
	private int id_personnel;
	private String firstName;
	private String lastName;
	private String password;
	private float salary;
	private int cin;
	private String login;
	private String genre;
	private String email;
	private String adress;
	private int tel;
	
	private List<Workload> wk;
	private Administrator admin;
		
	
	public Personnel() {
		super();
	} 
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {return this.id_personnel;}
	public void setId(int id) {this.id_personnel = id;}   
	
	public String getFirstName() {return this.firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}   
	
	public String getLastName() {return this.lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}   
	
	public String getLogin() {return this.login;}
	public void setLogin(String login) {this.login = login;}   
	
	public String getPassword() {return this.password;}
	public void setPassword(String password) {this.password = password;}   
	
	public float getSalary() {return this.salary;}
	public void setSalary(float salary) {this.salary = salary;}
	
	public int getCin() {return this.cin;}
	public void setCin(int cin) {this.cin = cin;}   
	
	public String getEmail() {return this.email;}
	public void setEmail(String email) {this.email = email;}
	
	public String getAdress() {return this.adress;}
	public void setAdress(String adress) {this.adress = adress;}   
	
	public int getTel() {return this.tel;}
	public void setTel(int tel) {this.tel = tel;}   
	@ManyToOne
	@JoinColumn(name = "Admin_id_fk")
	public Administrator getAdmin() {
		return admin;
	}

	public void setAdmin(Administrator admin) {
		this.admin = admin;
	}

	@ManyToMany
	@JoinColumn(name="work_id")
	public List<Workload> getWk() {
		return wk;
	}

	public void setWk(List<Workload> wk) {
		this.wk = wk;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}