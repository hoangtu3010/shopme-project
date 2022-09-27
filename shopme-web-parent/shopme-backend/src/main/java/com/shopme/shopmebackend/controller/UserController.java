package com.shopme.shopmebackend.controller;

import com.shopme.shopmebackend.service.UserService;
import com.shopme.shopmecommon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getListUsers(Model model) {
        List<User> users = userService.listAll();
        model.addAttribute("listUsers", users);

        return "users";
    }
}
