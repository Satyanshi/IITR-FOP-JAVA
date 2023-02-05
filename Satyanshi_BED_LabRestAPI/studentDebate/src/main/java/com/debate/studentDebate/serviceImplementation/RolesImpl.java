package com.debate.studentDebate.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.debate.studentDebate.entity.Roles;
import com.debate.studentDebate.repository.roleRepo;
import com.debate.studentDebate.service.Role;

@Service
public class RolesImpl implements Role {

    @Autowired
    private roleRepo roleRepository;

    @Override
    public Roles saveRole(Roles rolesname) {
        return roleRepository.save(rolesname);
    }

    @Override
    public Roles findByRolename(String rolesname) {
        return roleRepository.findByRolename(rolesname);
    }

    @Override
    public List<Roles> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

	@Override
	public void updateRole(Roles rolesname, Long id) {
		Roles foundRole = roleRepository.findById(id).get();
		foundRole.setRolesname(rolesname.getRolesname());
		roleRepository.save(foundRole);
	}
}