package org.esprit.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Developpeur
 *
 */
@Entity

public class Developpeur extends Personnel  implements Serializable {

	
	
	private int id_dev;
	private Team team;
	//private Reward rewards;
	private static final long serialVersionUID = 1L;

	public Developpeur() {
		super();
	}   
	public int getId_dev() {
		return this.id_dev;
	}

	public void setId_dev(int id_dev) {
		this.id_dev = id_dev;
	}
	@ManyToOne
	@JoinColumn(name = "Team_id_fk")
	public Team getTeam() {return team;}
	public void setTeam(Team team) {this.team = team;}
	/*@ManyToMany
	public Collection<Reward> getRewards() {return rewards;}
	public void setRewards(Collection<Reward> rewards) {this.rewards = rewards;}*/
   
}
