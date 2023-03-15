package com.example.demo;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@Controller
    public class MyController {
    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "home";
    }
}
