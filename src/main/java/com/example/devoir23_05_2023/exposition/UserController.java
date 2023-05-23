package com.example.devoir23_05_2023.exposition;

import com.example.devoir23_05_2023.Application.IUserService;
import com.example.devoir23_05_2023.converter.UserConverter;
import com.example.devoir23_05_2023.domaine.User;
import com.example.devoir23_05_2023.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    IUserService iUserService;

    @Autowired
    UserConverter userConverter;

    @PostMapping
    public void create(@RequestBody UserDto userDto){
        User user = userConverter.convertUserDtoToUser(userDto);
        iUserService.create(user);
    }

    @GetMapping("/{id}")
    public UserDto readById(@PathVariable("id") Long id){
        User user = iUserService.readById(id);
        return userConverter.convertUsertoUserDto(user);
    }
}
