package com.mirbozorgi.graphQL.graphQLControllers.user;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mirbozorgi.graphQL.domain.Role;
import com.mirbozorgi.graphQL.domain.User;
import com.mirbozorgi.graphQL.model.request.RoleRequest;
import com.mirbozorgi.graphQL.model.request.UserRequest;
import com.mirbozorgi.graphQL.service.implementations.RoleService;
import com.mirbozorgi.graphQL.service.implementations.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMutation implements GraphQLMutationResolver {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    public User createUser(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setLogin(userRequest.getLogin());
        List<Role> roles = new ArrayList<>();
        for (RoleRequest roleRequest : userRequest.getRoles()) {
            Role generatedRole = new Role();
            generatedRole.setId(roleRequest.getId());
            generatedRole.setName(roleRequest.getName());
            roles.add(generatedRole);
        }
        user.setRoles(roles);
        return this.userService.saveUser(user);
    }

    public User editUser(UserRequest userRequest){
        User user = new User();
        user.setId(userRequest.getId());
        user.setName(userRequest.getName());
        user.setLogin(userRequest.getLogin());
        List<Role> roles = new ArrayList<>();
        for (RoleRequest roleRequest : userRequest.getRoles()) {
            Role generatedRole = new Role();
            generatedRole.setId(roleRequest.getId());
            generatedRole.setName(roleRequest.getName());
            roles.add(generatedRole);
        }
        user.setRoles(roles);
        return this.userService.editUser(user);
    }

    public boolean deleteUser(int id){
        return userService.deleteUser(id);
    }


}
