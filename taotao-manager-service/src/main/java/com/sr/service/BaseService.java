package com.sr.service;

import com.github.abel533.entity.Example;
import com.github.abel533.entity.Example.Criteria;
import com.github.abel533.mapper.Mapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sr.batis.po.BasePoJo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public abstract class BaseService<T extends BasePoJo> {

    @Autowired
    private Mapper<T> mapper;

    private Class<T> clazz;

    public BaseService() {
        Type superclass = this.getClass().getGenericSuperclass();
        ParameterizedType type = (ParameterizedType) superclass;
        clazz = (Class<T>) type.getActualTypeArguments()[0];
    }


    public List<T> queryAll() {
        return this.mapper.select(null);
    }

    public int deleteByPrimaryKey(Object pk) {
        return this.mapper.deleteByPrimaryKey(pk);
    }


    public int delete(T t) {
        return this.mapper.delete(t);
    }


    public int insert(T t) {
        return this.mapper.insert(setCreateDate(t));
    }


    public int insertSelective(T t) {
        return this.mapper.insertSelective(setCreateDate(t));
    }


    public T selectByPrimaryKey(Object pk) {
        return this.mapper.selectByPrimaryKey(pk);
    }


    public int selectCount(T t) {
        return this.mapper.selectCount(t);
    }


    public List<T> select(T t) {
        return this.mapper.select(t);
    }


    public T selectOne(T t) {
        return this.mapper.selectOne(t);
    }


    public int updateByPrimaryKey(T t) {
        return this.mapper.updateByPrimaryKey(setUpdateDate(t));
    }


    public int updateByPrimaryKeySelective(T t) {
        return this.mapper.updateByPrimaryKeySelective(setUpdateDate(t));
    }


    public int deleteByIds(List<Object> ids) {
        Example example = new Example(clazz);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", ids);
        return this.mapper.deleteByExample(example);
    }

    public PageInfo<T> queryListByPage(T t, Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<T> list = this.mapper.select(t);
        return new PageInfo<T>(list);
    }

    public PageInfo<T> queryListByPage(T t, Integer page, Integer rows, String order) throws IllegalAccessException {
        PageHelper.startPage(page, rows);
        Example example = new Example(clazz);
        if (StringUtils.isNoneBlank(order)) {
            example.setOrderByClause(order);
        }
        Criteria criteria = example.createCriteria();
        Field[] fields = t.getClass().getDeclaredFields();
        Field.setAccessible(fields, true);
//        for (Field f : fields) {
//            if (f.get(t) != null) {
//                criteria.andEqualTo(f.getName(), f.get(t));
//            }
//        }
        List<T> list = this.mapper.selectByExample(example);
        return new PageInfo<T>(list);
    }


/*    List<T> selectByExample(Object o) {

    }*/

/*

    int selectCountByExample(Object o) {
    }
*/

/*
    int updateByExample(@Param("record") T t, @Param("example") Object o) {
    }*/


/*    int updateByExampleSelective(@Param("record") T t, @Param("example") Object o) {
    }*/


  /*  List<T> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
    }
*/

/*
    List<T> selectByRowBounds(T t, RowBounds rowBounds) {
    }
*/

    private T setCreateDate(T t) {
        if (t.getCreated() == null) {
            t.setCreated(new Date());
            t.setUpdated(new Date());
        } else if (t.getUpdated() == null) {
            t.setUpdated(t.getCreated());
        }
        return t;
    }

    private T setUpdateDate(T t) {
        t.setUpdated(new Date());
        return t;
    }
}