package com.mirbozorgi.graphQL.service.implementations;

import com.mirbozorgi.graphQL.domain.Role;
import com.mirbozorgi.graphQL.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleService implements com.mirbozorgi.graphQL.service.interfaces.RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role createRole(Role role){
        return roleRepository.save(role);
    }

    @Override
    public Role getRole(int id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public Role editRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public boolean deleteRole(int id) {
        roleRepository.deleteById(id);
        return true;
    }

}
