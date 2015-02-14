package org.esprit.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Team
 *
 */
@Entity
@Table(name = "t_team")
public class Team implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	
private int id;
private Project project;
private Team_Leader team_ld;

private Collection<Employee>employees;


public Team() {
	super();
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId() {return this.id;}
public void setId(int id) {this.id = id;}

@OneToMany(mappedBy="team")
public Collection<Employee> getEmployees() {return employees;}
public void setEmployees(Collection<Employee> employees) {this.employees = employees;}


@OneToOne
public Project getProject() {return project;}
public void setProject(Project project) {this.project = project;}

@OneToOne
public Team_Leader getTeam_ld() {
	return team_ld;
}
public void setTeam_ld(Team_Leader team_ld) {
	this.team_ld = team_ld;
}





}