package com.example.bootinit.controller;

import com.example.bootinit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @Autowired
    UserService userService;

    @GetMapping("/userList")
    public String getUser(ModelMap model) {

        model.addAttribute("userList", userService.selectAllUser());
        return "userList";
    }

    @GetMapping("/userView/{id}")
    public String getUserView(@PathVariable("id") String userId, ModelMap model) {

        model.addAttribute("userView", userService.selectOneUser(userId));
        return "userView";
    }
}
