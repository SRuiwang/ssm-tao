package com.sr.service.inte;

import com.sr.batis.po.User;

public interface UserService {
    public User findUserById(Integer UserId) throws Exception;
}