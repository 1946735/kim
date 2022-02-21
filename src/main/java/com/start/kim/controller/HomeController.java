package com.start.kim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/kimins")
    public String home(){
        return "index";
    }
}



