package com.mirbozorgi.graphQL.graphQLControllers.role;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mirbozorgi.graphQL.domain.Role;
import com.mirbozorgi.graphQL.model.request.RoleRequest;
import com.mirbozorgi.graphQL.service.implementations.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleMutation implements GraphQLMutationResolver {

    @Autowired
    private RoleService roleService;

    public Role createRole(RoleRequest roleRequest) {
        Role role = new Role();
        role.setName(roleRequest.getName());
        return roleService.createRole(role);
    }

    public Role editRole(RoleRequest roleRequest) {
        Role role = new Role();
        role.setId(roleRequest.getId());
        role.setId(roleRequest.getId());
        return roleService.editRole(role);
    }

    public boolean deleteRole(int id) {
        return roleService.deleteRole(id);
    }
}
