package com.harshad.librarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.harshad.librarymanagementsystem.entity.User;
import com.harshad.librarymanagementsystem.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/home")
    public String userHome() {
        return "user_home";
    }


    @GetMapping("/admin/home")
    public String adminHome() {
        return "home";
 
    }

    
    @GetMapping("/login")
    public String login() {
        return "Login";
    }

    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        userService.registerUser(user);
        return "redirect:/login"; // Redirect to the login page after successful registration
    }

    @GetMapping("/registerAdmin")
    public String getform(Model model){
        return "Adminregister";
    }
    @PostMapping("/registerAdmin")
    public String registerAdmin(@ModelAttribute("admin") User admin) {
        userService.registerAdmin(admin);
        return "redirect:/login";
    }
}
