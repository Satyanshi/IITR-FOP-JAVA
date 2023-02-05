package com.debate.studentDebate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.debate.studentDebate.entity.Roles;

@Repository
public interface roleRepo extends JpaRepository<Roles, Long> {
    
	Roles findByRolename(String rolesname);
}
