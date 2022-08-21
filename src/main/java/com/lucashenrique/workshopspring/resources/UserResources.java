package com.lucashenrique.workshopspring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucashenrique.workshopspring.Services.UserServices;
import com.lucashenrique.workshopspring.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @Autowired
    private UserServices service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> FindAll() {
        List<User> list = service.FindAll();
        return ResponseEntity.ok().body(list);
    }

}