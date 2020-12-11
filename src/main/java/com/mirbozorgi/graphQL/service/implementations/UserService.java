package com.mirbozorgi.graphQL.service.implementations;


import com.mirbozorgi.graphQL.domain.User;
import com.mirbozorgi.graphQL.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService implements com.mirbozorgi.graphQL.service.interfaces.UserService {

    private UserRepository userRepository;

    public UserService(UserRepository db) {
        this.userRepository = db ;
    }


    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).get();
    }

    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    public boolean deleteUser(int id) {
        this.userRepository.deleteById(id);
        return true;
    }

    public List<User> usersByName(String name){
        System.out.println("Finding users by :   " + name);
        return userRepository.findAllByName(name);
    }

    public List<User> usersByLogin(String login){
        System.out.println("Finding users by :   " + login);
        return userRepository.findAllByLogin(login);
    }

    public User editUser(User user){
        System.out.println("Editing user :   " + user);
        return userRepository.save(user);
    }

}