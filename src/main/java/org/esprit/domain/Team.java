package org.esprit.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Team
 *
 */
@Entity
@Table(name = "t_team")
public class Team implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	
private int id_team;
private Project project;
private Team_Leader team_ld;

private List<Developpeur>dev;


public Team() {
	super();
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId() {return this.id_team;}
public void setId(int id) {this.id_team = id;}

@OneToMany(mappedBy="team")
public List<Developpeur> getEmployees() {return dev;}
public void setEmployees(List<Developpeur> dev) {this.dev = dev;}


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