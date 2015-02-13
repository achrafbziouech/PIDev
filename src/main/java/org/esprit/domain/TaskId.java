package org.esprit.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TaskId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int team_id;
	private int project_id;
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + project_id;
		result = prime * result + team_id;
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
		if (project_id != other.project_id)
			return false;
		if (team_id != other.team_id)
			return false;
		return true;
	}
	
	

}
