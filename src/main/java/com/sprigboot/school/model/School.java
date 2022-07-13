package com.sprigboot.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="school")

public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="school_name")
	private String schoolName;
	@Column(name="registerd_number")
	private String registerdNumber;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="student_grade")
	private String studentGrade;
	
	@Column(name="guardian_name")
	private String guardianName;
	
	@Column(name="contact_details")
	private String contactDetails;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getRegisterdNumber() {
		return registerdNumber;
	}
	public void setRegisterdNumber(String registerdNumber) {
		this.registerdNumber = registerdNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	
}
