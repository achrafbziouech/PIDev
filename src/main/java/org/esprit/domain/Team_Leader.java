package org.esprit.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Team_Leader _
 *
 */
@Entity

public class Team_Leader extends Personnel implements Serializable {
	
	@Enumerated(EnumType.STRING)
	private Domaine domaine;
	private String post;
	private static final long serialVersionUID = 1L;
	/*private Team team;*/
	public Team_Leader() {
		super();
	}
	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
   
}
