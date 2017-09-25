package com.sr.batis.mapper;

import com.github.abel533.mapper.Mapper;
import com.sr.batis.po.User;

import java.util.List;

public interface UserMapper extends Mapper<User>{
    public List<User> selectAll ()throws Exception;
}