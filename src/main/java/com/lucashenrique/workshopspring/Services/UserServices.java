package com.lucashenrique.workshopspring.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucashenrique.workshopspring.Services.exception.ObjectNotFoundException;
import com.lucashenrique.workshopspring.domain.User;
import com.lucashenrique.workshopspring.dto.UserDTO;
import com.lucashenrique.workshopspring.repository.UserRepository;

@Service
public class UserServices {
    @Autowired
    private UserRepository repo;

    public List<User> FindAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));

    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
