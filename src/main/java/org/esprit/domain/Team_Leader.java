package org.esprit.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Team_Leader _
 *
 */
@Entity

public class Team_Leader extends Personnel implements Serializable {

	private Domaine domaine;
	private String Adress;
	private String post;
	private static final long serialVersionUID = 1L;
	private Team team;

	@OneToOne
	public Team getTeam() {return team;}
	public void setTeam(Team team) {this.team = team;}
	public Team_Leader() {
		super();
	}
	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
   
}
