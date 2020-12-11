package com.mirbozorgi.graphQL.repository;

import com.mirbozorgi.graphQL.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByName(String name);

    List<User> findAllByLogin(String login);

}
