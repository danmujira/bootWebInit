package com.example.bootinit.service;

import com.example.bootinit.dto.UserDto;

import java.util.List;


public interface UserService {
    public UserDto selectOneUser (String userId);
    public List<UserDto> selectAllUser();
}
