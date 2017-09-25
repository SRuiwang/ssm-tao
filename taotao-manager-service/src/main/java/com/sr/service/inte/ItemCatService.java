package com.sr.service.inte;

import com.sr.batis.mapper.ItemCatMapper;
import com.sr.batis.po.ItemCat;

import java.util.List;

public interface ItemCatService {

    public List<ItemCat> findItemCatsByParentId(Long parentId);

}