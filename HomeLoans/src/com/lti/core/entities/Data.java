package com.lti.core.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Personal")
@Table(name="Personal")
public class Data {
	@Id
	@Column(name="USER_ID")
	private int userid;
	
	@Column(name="F_NAME")
	private String fname;
	
	@Column(name="M_NAME")
	private String mname;
	
	@Column(name="L_NAME")
	private String lname;
	
	
	@Column(name="PHONE")
	private long phone;
	
	
	@Column(name="DOB")
	private Date dob;
	
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="NATIONALITY")
	private String nation;
	
	@Column(name="AADHAR_NO")
	private String aadhar;
	
	@Column(name="PAN_NO")
	private String pan;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date date) {
		this.dob = date;
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


	@Override
	public String toString() {
		return "Admin [userid=" + userid + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", phone="
				+ phone + ", dob=" + dob + ", gender=" + gender + ", nation=" + nation + ", aadhar=" + aadhar + ", pan="
				+ pan + "]";
	}

	
	
	
}
