package org.esprit.domain;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Team
 *
 */
@Entity

public class Team implements Serializable {

	   
	@Id
	private int team_id;
	private String team_leader_name;
	private static final long serialVersionUID = 1L;
	@OneToOne
	@JoinColumn(name = "team_leader_id_fk", nullable = false)
	private Team_Leader team_lader; 
	public Team() {
		super();
	}   
	public int getTeam_id() {
		return this.team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}   
	public String getTeam_leader_name() {
		return this.team_leader_name;
	}

	public void setTeam_leader_name(String team_leader_name) {
		this.team_leader_name = team_leader_name;
	}
   
}
