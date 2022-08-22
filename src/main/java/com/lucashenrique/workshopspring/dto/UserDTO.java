package com.lucashenrique.workshopspring.dto;

import java.io.Serializable;

import com.lucashenrique.workshopspring.domain.User;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    public UserDTO() {

    }

    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
