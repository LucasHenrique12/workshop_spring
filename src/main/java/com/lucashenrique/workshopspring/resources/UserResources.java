package com.lucashenrique.workshopspring.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucashenrique.workshopspring.Services.UserServices;
import com.lucashenrique.workshopspring.domain.User;
import com.lucashenrique.workshopspring.dto.UserDTO;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @Autowired
    private UserServices service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> FindAll() {
        List<User> list = service.FindAll();
        List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

}