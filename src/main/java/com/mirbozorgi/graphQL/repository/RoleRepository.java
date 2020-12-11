package com.mirbozorgi.graphQL.repository;

import com.mirbozorgi.graphQL.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
