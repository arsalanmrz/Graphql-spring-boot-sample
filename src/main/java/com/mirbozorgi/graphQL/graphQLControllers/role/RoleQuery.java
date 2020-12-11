package com.mirbozorgi.graphQL.graphQLControllers.role;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mirbozorgi.graphQL.domain.Role;
import com.mirbozorgi.graphQL.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleQuery implements GraphQLQueryResolver {


    @Autowired
    private RoleService roleService;

    public Role role(int id){
        return roleService.getRole(id);
    }

    public List<Role> roles(){
        return roleService.getAllRoles();
    }

}
