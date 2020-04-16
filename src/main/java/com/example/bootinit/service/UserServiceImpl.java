package com.example.bootinit.service;

import com.example.bootinit.dao.UserMapper;
import com.example.bootinit.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDto selectOneUser(String userId) {
        return userMapper.selectOneUser(userId);
    }

    @Override
    public List<UserDto> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
