package com.it.sportsplus.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_coach")


public class Coach implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="coach_id")
	private Long coachId;
	@Column(name="coach_name")
	private String coachName;
	@Column(name="coach_speciality")
	private String coachSpeciality;
	@Column(name="coach_phno")
	private String coachPhno;
	@Column(name="group_id")
	private String groupId;
	
	
	public Long getCoachId() {
		return coachId;
	}

	public void setCoachId(Long coachId) {
		this.coachId = coachId;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getCoachSpeciality() {
		return coachSpeciality;
	}

	public void setCoachSpeciality(String coachSpeciality) {
		this.coachSpeciality = coachSpeciality;
	}

	public String getCoachPhno() {
		return coachPhno;
	}

	public void setCoachPhno(String coachPhno) {
		this.coachPhno = coachPhno;
	}
	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Coach(String coachName, String coachSpeciality, String coachPhno, String groupId) {
		super();
		this.coachName = coachName;
		this.coachSpeciality = coachSpeciality;
		this.coachPhno = coachPhno;
		this.groupId = groupId;
	}

	
	
	public Coach() {
		super();
	}

}
