package com.it.sportsplus.models;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tbl_athlete")
public class Athlete implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="athlete_id")
	private Long athleteId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="date_of_birth")
	private String dOB;
	@Column(name="age")
	private String age;
	@Column(name="gender")
	private String gender;
	@Column(name="contact_number")
	private String contactNo;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="pincode")
	private String pincode;
	@Column(name="guardian_name")
	private String guardianName;
	@Column(name="guardian_address")
	private String guardianAddress;
	@Column(name="guardian_contact")
	private String guardianContact;
	@Column(name="primary_sports")
	private String primarySports;
	@Column(name="training_base")
	private String trainingBase;
	@Column(name="college")
	private String college;
	@Column(name="group_id")
	private String groupId;
	@Column(name="coach_id")
	private String coachId;
	@Column(name="level")
	private String level;
	@Column(name="residential_status")
	private String residentialStatus;
	@Column(name="athlete_status")
	private String athleteStatus;
	@Column(name="blood_group")
	private String bloodGroup;
	
	
	
	public Long getAthleteId() {
		return athleteId;
	}
	public void setAthleteId(Long athleteId) {
		this.athleteId = athleteId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
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
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
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
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianAddress() {
		return guardianAddress;
	}
	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}
	public String getGuardianContact() {
		return guardianContact;
	}
	public void setGuardianContact(String guardianContact) {
		this.guardianContact = guardianContact;
	}
	public String getPrimarySports() {
		return primarySports;
	}
	public void setPrimarySports(String primarySports) {
		this.primarySports = primarySports;
	}
	public String getTrainingBase() {
		return trainingBase;
	}
	public void setTrainingBase(String trainingBase) {
		this.trainingBase = trainingBase;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getCoachId() {
		return coachId;
	}
	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public String getAthleteStatus() {
		return athleteStatus;
	}
	public void setAthleteStatus(String athleteStatus) {
		this.athleteStatus = athleteStatus;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Athlete(String firstName, String lastName, String dOB, String age, String gender, String contactNo,
			String address, String city, String pincode, String guardianName, String guardianAddress,
			String guardianContact, String primarySports, String trainingBase, String college, String groupId, String coachId, String level,
			String residentialStatus, String athleteStatus, String bloodGroup) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dOB = dOB;
		this.age = age;
		this.gender = gender;
		this.contactNo = contactNo;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.guardianName = guardianName;
		this.guardianAddress = guardianAddress;
		this.guardianContact = guardianContact;
		this.primarySports = primarySports;
		this.trainingBase = trainingBase;
		this.college = college;
		this.groupId= groupId;
		this.coachId= coachId;
		this.level = level;
		this.residentialStatus = residentialStatus;
		this.athleteStatus = athleteStatus;
		this.bloodGroup = bloodGroup;
	}
	public Athlete() {
		super();
	}
	
	
		
}
