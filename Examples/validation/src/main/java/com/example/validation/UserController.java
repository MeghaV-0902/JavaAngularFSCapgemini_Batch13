package com.example.validation;

import com.example.validation.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping(value = "/registerUser")
    public String registerUser(Model model) {
        model.addAttribute("user", new User());
        return "userform";
    }

    @PostMapping(value="/showUser")
    public String showUser(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "userform";
        }
        model.addAttribute("user", user);
        return "user";
    }
}