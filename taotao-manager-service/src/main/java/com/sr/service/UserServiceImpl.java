package com.sr.service;

import com.sr.batis.mapper.UserMapper;
import com.sr.batis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll() throws Exception {
        return userMapper.selectAll();
    }
}