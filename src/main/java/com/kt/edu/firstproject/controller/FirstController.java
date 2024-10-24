package com.kt.edu.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "world kim"); //변수 등록
        return "greetings";
    }


    @GetMapping("/bye")
    public String goodByeYou(Model model) {
        model.addAttribute("username", "world kim"); //변수 등록
        return "goodbye";
    }

}