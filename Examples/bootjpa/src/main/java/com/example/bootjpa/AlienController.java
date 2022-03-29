package com.example.bootjpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AlienController
{
    @RequestMapping("/")
    public String home()
    {
        return  "home.jsp";
    }
}
