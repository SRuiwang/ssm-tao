package com.sr.web.controller;

import com.sr.batis.po.ItemCat;
import com.sr.service.inte.ItemCatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("itemcat")
public class ItemCatController {

    private ItemCatService itemCatService;

    @RequestMapping(value = "")
    public List<ItemCat> getItemCatByParentId(Long parentId) {
        return itemCatService.findItemCatsByParentId(parentId);
    }

}