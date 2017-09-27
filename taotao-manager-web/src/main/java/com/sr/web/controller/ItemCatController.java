package com.sr.web.controller;

import com.sr.batis.po.ItemCat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("item/cat")
public class ItemCatController {

    @RequestMapping(value = "list")
    public List<ItemCat> getItemCatByParentId(@RequestParam Integer page,@RequestParam Integer rows) {

        return null;
    }

}