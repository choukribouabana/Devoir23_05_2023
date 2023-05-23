package com.example.devoir23_05_2023.Application;

import com.example.devoir23_05_2023.domaine.User;

public interface IUserService {
    void create(User user);
    User readById(Long id);
}
