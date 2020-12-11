package com.mirbozorgi.graphQL.graphQLControllers.user;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mirbozorgi.graphQL.domain.User;
import com.mirbozorgi.graphQL.service.implementations.UserService;
import com.mirbozorgi.graphQL.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserQuery implements GraphQLQueryResolver {

    @Autowired
    private UserService userService ;
    @Autowired
    private RoleService roleService;



    public User getUser(int id){
        return userService.getUser(id);
    }

    public List<User> usersByName(String name){
        System.out.println("Query:   " + name);
        return userService.usersByName(name);
    }

    public List<User> usersByLogin(String login){
        System.out.println("Query:   " + login);
        return userService.usersByLogin(login);
    }

}
