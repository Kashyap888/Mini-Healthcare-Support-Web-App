package com.example.healthcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatbotController {

    @GetMapping("/chatbot")
    public String chatbotPage() {
        return "chatbot";
    }

    @PostMapping("/chat")
    public String chat(@RequestParam String question, Model model) {

        String q = question.toLowerCase();
        String response;

        if (q.contains("medicine")) {
            response = "We help arrange low-cost or donated medicines through partner NGOs.";
        } else if (q.contains("appointment")) {
            response = "We assist patients in booking appointments with partner hospitals.";
        } else if (q.contains("volunteer")) {
            response = "You can register as a volunteer using the support form on the home page.";
        } else if (q.contains("free")) {
            response = "We connect patients with NGOs that provide free or subsidized treatment.";
        } else {
            response = "Please submit a support request and our team will contact you.";
        }

        model.addAttribute("response", response);
        return "chatbot";
    }
}
