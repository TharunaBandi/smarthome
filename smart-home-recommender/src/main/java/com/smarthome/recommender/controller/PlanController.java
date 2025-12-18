package com.smarthome.recommender.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanController {

    @GetMapping("/")
    public String root() {
        // redirect root to login page
        return "redirect:/login";
    }

    @GetMapping("/planner")
    public String showPlanner() {
        // Renders templates/home.html
        return "home";
    }
}