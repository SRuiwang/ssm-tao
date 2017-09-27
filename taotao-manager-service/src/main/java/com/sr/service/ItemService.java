package com.sr.service;

import com.github.pagehelper.PageInfo;
import com.sr.batis.po.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemService extends BaseService<Item> {
    public PageInfo<Item> queryItemByPage(Integer page, Integer rows) throws IllegalAccessException {
        Item item = new Item();
        item.setStatus(1);
        return super.queryListByPage(item, page, rows, "updated DESC");
    }


}