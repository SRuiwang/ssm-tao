package com.sr.service.impl;

import com.sr.batis.mapper.UserMapper;
import com.sr.batis.po.User;
import com.sr.service.inte.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(Integer id) throws Exception {
        return userMapper.findUserById(id);
    }

}