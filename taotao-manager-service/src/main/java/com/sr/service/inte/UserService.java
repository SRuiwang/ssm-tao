package com.sr.service.inte;

import com.sr.batis.po.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<User> selectAll() throws Exception;
}