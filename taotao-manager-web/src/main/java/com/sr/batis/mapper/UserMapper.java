package com.sr.batis.mapper;

import com.sr.batis.po.User;

public interface UserMapper {

    public User findUserById(Integer id) throws Exception;
}