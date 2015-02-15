package org.esprit.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Developpeur
 *
 */
@Entity

public class Developpeur extends Personnel  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@ManyToMany
	private List<Team> team;
	
	public Developpeur() {
		super();
	}   
	
	
   
}
