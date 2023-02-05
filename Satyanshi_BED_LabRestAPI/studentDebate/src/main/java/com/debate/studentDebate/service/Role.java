package com.debate.studentDebate.service;

import java.util.List;

import com.debate.studentDebate.entity.Roles;

public interface Role {
	Roles findByRolename(String rolesname);

	Roles saveRole(Roles rolesname);

	void deleteRole(Long id);

	List<Roles> findAllRoles();

	void updateRole(Roles rolesname, Long id);
}