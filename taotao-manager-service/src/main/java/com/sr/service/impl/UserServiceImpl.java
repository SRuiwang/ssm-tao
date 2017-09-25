package com.sr.service.impl;

import com.sr.batis.mapper.UserMapper;
import com.sr.batis.po.User;
import com.sr.service.inte.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() throws Exception {
        return userMapper.selectAll();
    }
}