package com.sr.web.controller;

import com.sr.batis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    //private UserService userService;

    @RequestMapping("list")
    public void listUser() throws Exception {
//        List<User> users = userService.selectAll();
//        System.out.println("user.size["+users.size());
    }

}