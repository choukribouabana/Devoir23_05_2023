package com.example.devoir23_05_2023.Application;

import com.example.devoir23_05_2023.domaine.User;
import com.example.devoir23_05_2023.infrastructure.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IUserServiceImpl implements IUserService{
    @Autowired
    IUserRepository iUserRepository;
    @Override
    public void create(User user) {
        iUserRepository.save(user);
    }

    @Override
    public User readById(Long id) {
        Optional<User> userOptional =  iUserRepository.findById(id);
        return userOptional.isPresent() ? userOptional.get(): null;
    }
}
