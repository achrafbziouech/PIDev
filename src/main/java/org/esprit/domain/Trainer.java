package org.esprit.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trainer
 *
 */
@Entity

public class Trainer extends Personnel implements Serializable {

	
	private static final long serialVersionUID = 1L;
    
	@ManyToMany
	@JoinTable(
	  name="train_Sess",
	  joinColumns=@JoinColumn(name="trainer_Id"),
	  inverseJoinColumns = @JoinColumn(name="session_id")
	 )
		
	
    private List<Training_session> training_sessions ;
    
	public Trainer() {
		super();
	}
   
}
