package org.esprit.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TaskId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idteam;
	private int idproject;
	public int getIdteam() {
		return idteam;
	}
	public void setIdteam(int idteam) {
		this.idteam = idteam;
	}
	public int getIdproject() {
		return idproject;
	}
	public void setIdproject(int idproject) {
		this.idproject = idproject;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idproject;
		result = prime * result + idteam;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof TaskId))
			return false;
		TaskId other = (TaskId) obj;
		if (idproject != other.idproject)
			return false;
		if (idteam != other.idteam)
			return false;
		return true;
	}
	
	

}
