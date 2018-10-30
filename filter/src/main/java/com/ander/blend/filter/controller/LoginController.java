package com.ander.blend.filter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "跳转登录 页面 /doLogin";
    }


    @PostMapping("/login/doLogin")
    public String doLogin(@RequestParam String username, HttpSession session) {
        if (username.equals("admin")) {
            session.setAttribute("username", "admin");
            return "登录成功";
        } else {
            return "登录失败";
        }


    }

    @GetMapping("/test1")
    public String test1() {
        System.out.println("走到测试了");
        return "success";

    }


}
