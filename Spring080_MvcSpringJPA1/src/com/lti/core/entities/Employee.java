package com.lti.core.entities;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name="Personal")
@Table(name="Personal")
public class Employee {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="F_NAME")
	private String firstname;
	
	@Column(name="M_NAME")
	private String mname;
	
	@Column(name="L_NAME")
	private String lname;
	
	@Column(name="PHONE")
	private long phone;
	
	@Column(name="DOB")
	//@DateTimeFormat(pattern = "dd-MM-yyyy")
	private String dob;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="NATIONALITY")
	private String nation;
	
	@Column(name="AADHAR_NO")
	private String aadhar;
	
	@Column(name="PAN_NO")
	private String pan;


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Employee [userId=" + userId + ", Firstname=" + firstname + ", mname=" + mname + ", lname=" + lname + ", phone="
				+ phone + ", dob=" + dob + ", gender=" + gender + ", nation=" + nation + ", aadhar=" + aadhar + ", pan="
				+ pan + "]";
	}

	
	
	
	
}
