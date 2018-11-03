package com.imooc.controller;

import com.imooc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//@Controller
@RestController  // @RestController = @Controller + @ResponseBody
@RequestMapping("user")
public class UserController {

    @RequestMapping("/getUser")
//    @ResponseBody
    public User helloTest(){
        User u = new User();
        u.setName("admin");
        u.setAge(19);
        u.setBirthday(new Date());
        u.setPassword("123456");
        return u;
    }
}
