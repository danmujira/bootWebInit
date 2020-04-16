package com.example.bootinit.dao;

import com.example.bootinit.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public UserDto selectOneUser (String userId);
    public List<UserDto> selectAllUser();
}