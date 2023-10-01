package com.pirai.file.manager.com.pirai.file.manager.controller;

import com.pirai.file.manager.com.pirai.file.manager.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/userlogin")
    public String userlogin(@ModelAttribute("user")User user){
        System.out.println(user.getUsername());
        return "";
    }

}
