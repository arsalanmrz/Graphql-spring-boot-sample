package com.mirbozorgi.graphQL.model.request;

import java.util.ArrayList;
import java.util.List;

public class UserRequest {

    private int id ;
    private String login ;
    private String name ;
    private List<RoleRequest> roles;


    public UserRequest() {
        this.roles = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoleRequest> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleRequest> roles) {
        this.roles = roles;
    }
}
