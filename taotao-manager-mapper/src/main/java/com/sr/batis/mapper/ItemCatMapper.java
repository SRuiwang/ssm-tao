package com.sr.batis.mapper;

import com.github.abel533.mapper.Mapper;
import com.sr.batis.po.ItemCat;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemCatMapper extends Mapper<ItemCat> {

    @Select("select * from tb_item_cat")
    public List<ItemCat> selectAll();
}