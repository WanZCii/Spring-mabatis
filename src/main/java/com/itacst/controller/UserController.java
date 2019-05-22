package com.itacst.controller;

import com.itacst.dao.UserDao;
import com.itacst.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    @RequestMapping(path = "/queryUser")
    @ResponseBody
    public List<User>queryUser(){
        List<User> users = userDao.queryUserList();
        return users;
    }
}
