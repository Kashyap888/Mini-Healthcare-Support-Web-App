package com.example.healthcare.controller;

import com.example.healthcare.model.SupportRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/submit")
    public String submitForm(SupportRequest request, Model model) {
        model.addAttribute("request", request);
        return "success";
    }
}
