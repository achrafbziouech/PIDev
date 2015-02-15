package org.esprit.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Director
 *
 */
@Entity

public class Director extends Personnel implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "director",cascade=CascadeType.ALL)
	private List<Reward> Rewards = new ArrayList<Reward>();
	
	public Director() {
		super();
	}
   
}
