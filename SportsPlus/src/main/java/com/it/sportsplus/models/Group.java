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
@Table(name="tbl_group")


public class Group implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="group_id")
	private Long groupId;
	@Column(name="group_name")
	private String groupName;
	@Column(name="group_description")
	private String groupDescription;
	@Column(name="group_status")
	private String groupStatus;
	@Column(name="coach_id")
	private String coachId;
	
	
	
	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public String getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}
	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}

	public Group(String groupName, String groupDescription, String groupStatus, String coachId) {
		super();
		this.groupName = groupName;
		this.groupDescription = groupDescription;
		this.groupStatus = groupStatus;
		this.coachId = coachId;
	}

	
	
	public Group() {
		super();
	}
	
}