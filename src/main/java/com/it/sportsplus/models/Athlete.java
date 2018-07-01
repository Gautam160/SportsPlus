package com.it.sportsplus.models;
import java.io.*;

import javax.persistence.*;

@Entity
@Table(name="tbl_athlete_data")
public class Athlete implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="athlete_id")
	private Long id;
	
	@Column(name="first_name")

	private String firstname;

	@Column(name="last_name")
	
	private String lastname;
	
	@Column(name="date_of_birth")
	
	private String dob;
	
	@Column(name="age")
	private String age;
	
	@Column(name="gender")
	
	private String gender;
	
	@Column(name="contact_number")
	
	private String contactno;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="guardian_name")
	private String guardianname;
	
	@Column(name="guardian_address")
	private String guardianaddress;
	
	@Column(name="guardian_contact")
	private String guardiancontact;
	
	@Column(name="primary_sports")
	private String primarysports;
	
	@Column(name="training_base")
	private String trainingbase;
	
	@Column(name="college")
	private String college;
	
	@Column(name="group_id")
	private Long groupid;
	
	@Column(name="coach_id")
	private Long coachid;
	
	@Column(name="level")
	private String level;
	
	@Column(name="residential_status")
	private String residentialstatus;
	
	@Column(name="athlete_status")
	private String athletestatus;
	
	@Column(name="blodd_group")
	private String bloodgroup;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getGuardianname() {
		return guardianname;
	}

	public void setGuardianname(String guardianname) {
		this.guardianname = guardianname;
	}

	public String getGuardianaddress() {
		return guardianaddress;
	}

	public void setGuardianaddress(String guardianaddress) {
		this.guardianaddress = guardianaddress;
	}

	public String getGuardiancontact() {
		return guardiancontact;
	}

	public void setGuardiancontact(String guardiancontact) {
		this.guardiancontact = guardiancontact;
	}

	public String getPrimarysports() {
		return primarysports;
	}

	public void setPrimarysports(String primarysports) {
		this.primarysports = primarysports;
	}

	public String getTrainingbase() {
		return trainingbase;
	}

	public void setTrainingbase(String trainingbase) {
		this.trainingbase = trainingbase;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Long getGroupid() {
		return groupid;
	}

	public void setGroupid(Long groupid) {
		this.groupid = groupid;
	}

	public Long getCoachid() {
		return coachid;
	}

	public void setCoachid(Long coachid) {
		this.coachid = coachid;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	
	public String getResidentialstatus() {
		return residentialstatus;
	}

	public void setResidentialstatus(String residentialstatus) {
		this.residentialstatus = residentialstatus;
	}

	public String getAthletestatus() {
		return athletestatus;
	}

	public void setAthletestatus(String athletestatus) {
		this.athletestatus = athletestatus;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}
	
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	
	public Athlete() {
		super();
	}

	public Athlete(Long id, String firstname, String lastname, String dob, String age, String gender, String contactno,
			String address, String city, String pincode, String guardianname, String guardianaddress,
			String guardiancontact, String primarysports, String trainingbase, String college, Long groupid,
			Long coachid, String level, String residentialstatus, String athletestatus, String bloodgroup) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.age = age;
		this.gender = gender;
		this.contactno = contactno;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.guardianname = guardianname;
		this.guardianaddress = guardianaddress;
		this.guardiancontact = guardiancontact;
		this.primarysports = primarysports;
		this.trainingbase = trainingbase;
		this.college = college;
		this.groupid = groupid;
		this.coachid = coachid;
		this.level = level;
		this.residentialstatus = residentialstatus;
		this.athletestatus = athletestatus;
		this.bloodgroup = bloodgroup;
	}
	

	
	
	
	
	

}
