package com.debate.studentDebate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String rolesname;

	public Roles() {
		super();
	}

	public Roles(Long id, String rolesname) {
		super();
		this.id = id;
		this.rolesname = rolesname;
	}

	public String getRolesname() {
		return rolesname;
	}

	public void setRolesname(String rolesname) {
		this.rolesname = rolesname;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Roles [id=" + id + ", rolesname=" + rolesname + "]";
	}

}
