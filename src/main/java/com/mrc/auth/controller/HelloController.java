package com.mrc.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @ResponseBody
    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping("/")
    public String index(){

        return "redirect:swagger-ui.html";

    }
}
