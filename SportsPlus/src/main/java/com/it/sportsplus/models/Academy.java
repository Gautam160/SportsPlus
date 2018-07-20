package com.it.sportsplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_academy")


public class Academy implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="academy_id")
	private Long academyId;
	
	@Column(name="academy_name")
	private String academyName;
	
	@Column(name="academy_created_date")
	private String academyCreatedDate;
	
	@Column(name="academy_updated_date")
	private String academyUpdatedDate;
	
	public Academy() {
		super();
	}
	public Academy(Long academyId, String academyName, String academyCreatedDate, String academyUpdatedDate) {
		super();
		this.academyId = academyId;
		this.academyName = academyName;
		this.academyCreatedDate = academyCreatedDate;
		this.academyUpdatedDate = academyUpdatedDate;
	}
	public Long getAcademyId() {
		return academyId;
	}
	public void setAcademyId(Long academyId) {
		this.academyId = academyId;
	}
	public String getAcademyName() {
		return academyName;
	}
	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}
	public String getAcademyCreatedDate() {
		return academyCreatedDate;
	}
	public void setAcademyCreatedDate(String academyCreatedDate) {
		this.academyCreatedDate = academyCreatedDate;
	}
	public String getAcademyUpdatedDate() {
		return academyUpdatedDate;
	}
	public void setAcademyUpdatedDate(String academyUpdatedDate) {
		this.academyUpdatedDate = academyUpdatedDate;
	}
	
	
	
}
