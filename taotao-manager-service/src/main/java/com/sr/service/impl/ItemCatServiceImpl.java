package com.sr.service.impl;

import com.sr.batis.mapper.ItemCatMapper;
import com.sr.batis.po.ItemCat;
import com.sr.service.inte.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService{

    @Autowired
    private ItemCatMapper mapper;

    public List<ItemCat> findItemCatsByParentId(Long parentId){
        ItemCat itemCat = new ItemCat();
        itemCat.setParentId(parentId);
        return mapper.select(itemCat);
    }
}