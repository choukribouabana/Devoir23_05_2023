package com.example.devoir23_05_2023.converter;

import com.example.devoir23_05_2023.domaine.User;
import com.example.devoir23_05_2023.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public User convertUserDtoToUser(UserDto userDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(userDto, User.class);
    }
    public UserDto convertUsertoUserDto(User user){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserDto.class);
    }
}
