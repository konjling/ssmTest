package com.wdd.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdd.bean.Dept;
import com.wdd.bean.User;
import com.wdd.service.UserService;
import com.wdd.util.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getAll")
    @ResponseBody
    public PageInfo getAll(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,5);
        List<User> userList =   userService.getAll();
        PageInfo page = new PageInfo(userList,5);
        return page;
    }

    @RequestMapping("/test")
    @ResponseBody
    public JsonMsg test(){
       List<Map<String,Object>> list = userService.getJobInfo();
       return new JsonMsg(true);
    }

}
