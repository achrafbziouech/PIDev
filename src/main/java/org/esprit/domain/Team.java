package org.esprit.domain;

import java.io.Serializable;
import java.util.ArrayList;
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
private List<Project> project;
private Team_Leader team_ld;
private List<Developpeur> dev ;


public Team() {
	super();
}
@ManyToMany
public List<Developpeur> getDev() {return dev;}
public void setDev(List<Developpeur> dev) {this.dev = dev;}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId() {return this.id_team;}
public void setId(int id) {this.id_team = id;}

@OneToMany(mappedBy="team")
public List<Project> getProject() {return project;}
public void setProject(List<Project> project) {this.project = project;}

@OneToOne
public Team_Leader getTeam_ld() {
	return team_ld;
}
public void setTeam_ld(Team_Leader team_ld) {
	this.team_ld = team_ld;
}


public int getId_team() {
	return id_team;
}

public void setId_team(int id_team) {
	this.id_team = id_team;
}





}