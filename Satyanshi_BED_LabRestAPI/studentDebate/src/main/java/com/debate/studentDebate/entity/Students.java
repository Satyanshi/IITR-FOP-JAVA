package com.debate.studentDebate.entity;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fName;
	private String lName;
	private String courses;
	private String country;
	@ManyToOne
	@JoinColumn(name = "rolesname")
	private Roles rolesname;
	
	public Students() {
		super();
	}
	
	public Students(Long id, String fName, String lName, String courses, String country, Roles role) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.courses = courses;
		this.country = country;
		this.rolesname = role;
	}

	public Long getId() {
		return id;
	}

	public String getFName() {
		return fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Roles getRoles() {
		return rolesname;
	}

	public void setRole(Roles role) {
		this.rolesname = role;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + fName + ", lastName=" + lName + ", course=" + courses
				+ ", country=" + country + ", rolesname=" + rolesname + "]";
	}

}