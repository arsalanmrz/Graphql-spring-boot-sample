package com.mirbozorgi.graphQL.service.interfaces;

import com.mirbozorgi.graphQL.domain.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(int id);

    User saveUser(User user);

    boolean deleteUser(int id);

    List<User> usersByName(String name);

    List<User> usersByLogin(String login);

    User editUser(User user);

}
