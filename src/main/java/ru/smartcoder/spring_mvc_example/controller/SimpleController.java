package ru.smartcoder.spring_mvc_example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.smartcoder.spring_mvc_example.service.*;

@Controller
public class SimpleController {

    @Autowired
    TestService service;

    @GetMapping("/hello")
    public String hello(Model model) {
        service.test();
        model.addAttribute("user", "Eraskin Alexei");
        return "simplest";
    }
}
