package com.lucashenrique.workshopspring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucashenrique.workshopspring.domain.User;
import com.lucashenrique.workshopspring.repository.UserRepository;

@Service
public class UserServices {
    @Autowired
    private UserRepository repo;

    public List<User> FindAll() {
        return repo.findAll();
    }
}
