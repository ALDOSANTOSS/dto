package com.example.dto.service;

import com.example.dto.Repository.UserRepositories;
import com.example.dto.dto.UserDto;
import com.example.dto.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepositories repositories;

    @Transactional(readOnly = true)
    public UserDto findById(Long id) {
        User entity = repositories.findById(id).get();
        UserDto dto = new UserDto(entity);
        return dto;
    }
}
