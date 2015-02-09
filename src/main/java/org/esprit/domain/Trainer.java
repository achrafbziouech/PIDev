package org.esprit.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trainer
 *
 */
@Entity

public class Trainer extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Trainer() {
		super();
	}
   
}
