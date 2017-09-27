package com.sr.batis.mapper;

import com.github.abel533.mapper.Mapper;
import com.sr.batis.po.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserMapper extends Mapper<User>{
    public List<User> selectAll ()throws Exception;

    @Override
    int deleteByPrimaryKey(Object o);

    @Override
    int delete(User user);

    @Override
    int insert(User user);

    @Override
    int insertSelective(User user);

    @Override
    User selectByPrimaryKey(Object o);

    @Override
    int selectCount(User user);

    @Override
    List<User> select(User user);

    @Override
    User selectOne(User user);

    @Override
    int updateByPrimaryKey(User user);

    @Override
    int updateByPrimaryKeySelective(User user);

    @Override
    int deleteByExample(Object o);

    @Override
    List<User> selectByExample(Object o);

    @Override
    int selectCountByExample(Object o);

    @Override
    int updateByExample(@Param("record") User user, @Param("example") Object o);

    @Override
    int updateByExampleSelective(@Param("record") User user, @Param("example") Object o);

    @Override
    List<User> selectByExampleAndRowBounds(Object o, RowBounds rowBounds);

    @Override
    List<User> selectByRowBounds(User user, RowBounds rowBounds);
}