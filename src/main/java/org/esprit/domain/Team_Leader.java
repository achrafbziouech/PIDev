package org.esprit.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Team_Leader _
 *
 */
@Entity

public class Team_Leader extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@OneToOne
	@JoinColumn(name = "team_id_fk", nullable = false)
	private Team team;
	public Team_Leader() {
		super();
	}
   
}
