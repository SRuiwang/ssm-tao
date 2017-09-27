package com.sr.web.controller;

import com.github.pagehelper.PageInfo;
import com.sr.batis.po.Item;
import com.sr.service.ItemService;
import com.sr.utils.EasyUIResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "list",method = {RequestMethod.GET})
    @ResponseBody
    public ResponseEntity<EasyUIResult> queryItemByPage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        try {
            PageInfo<Item> pageInfo = itemService.queryItemByPage(page, rows);
            EasyUIResult easyUIResult = new EasyUIResult(pageInfo.getTotal(), pageInfo.getList());
            return ResponseEntity.ok(easyUIResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
}