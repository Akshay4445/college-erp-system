package com.entity;

import java.time.LocalDate;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Student__Table12")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studid;

    private String firstname;
    private String midname;
    private String lastname;
    private String prnno;
    private String email;
    private String address;
    private long contactno;
    private String gender;
    private String branch;
    private LocalDate dob;
    private LocalDate addmitiondate;
    private String reportingauthority;
    private int currentyear;
    private long adarcardno;
    private String panno;
    private String studimg;

    public Student() {
        super();
    }

	public Student(Integer studid, String firstname, String midname, String lastname, String prnno, String email,
			String address, long contactno, String gender, String branch, LocalDate dob, LocalDate addmitiondate,
			String reportingauthority, int currentyear, long adarcardno, String panno, String studimg) {
		super();
		this.studid = studid;
		this.firstname = firstname;
		this.midname = midname;
		this.lastname = lastname;
		this.prnno = prnno;
		this.email = email;
		this.address = address;
		this.contactno = contactno;
		this.gender = gender;
		this.branch = branch;
		this.dob = dob;
		this.addmitiondate = addmitiondate;
		this.reportingauthority = reportingauthority;
		this.currentyear = currentyear;
		this.adarcardno = adarcardno;
		this.panno = panno;
		this.studimg = studimg;
	}

	public Integer getStudid() {
		return studid;
	}

	public void setStudid(Integer studid) {
		this.studid = studid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMidname() {
		return midname;
	}

	public void setMidname(String midname) {
		this.midname = midname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPrnno() {
		return prnno;
	}

	public void setPrnno(String prnno) {
		this.prnno = prnno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getAddmitiondate() {
		return addmitiondate;
	}

	public void setAddmitiondate(LocalDate addmitiondate) {
		this.addmitiondate = addmitiondate;
	}

	public String getReportingauthority() {
		return reportingauthority;
	}

	public void setReportingauthority(String reportingauthority) {
		this.reportingauthority = reportingauthority;
	}

	public int getCurrentyear() {
		return currentyear;
	}

	public void setCurrentyear(int currentyear) {
		this.currentyear = currentyear;
	}

	public long getAdarcardno() {
		return adarcardno;
	}

	public void setAdarcardno(long adarcardno) {
		this.adarcardno = adarcardno;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public String getStudimg() {
		return studimg;
	}

	public void setStudimg(String studimg) {
		this.studimg = studimg;
	}
}