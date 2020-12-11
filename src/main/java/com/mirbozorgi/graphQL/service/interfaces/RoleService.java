package com.mirbozorgi.graphQL.service.interfaces;

import com.mirbozorgi.graphQL.domain.Role;

import java.util.List;

public interface RoleService {

    Role createRole(Role role);

    Role getRole(int id);

    Role editRole(Role role);

    List<Role> getAllRoles();

    boolean deleteRole(int id);

}
