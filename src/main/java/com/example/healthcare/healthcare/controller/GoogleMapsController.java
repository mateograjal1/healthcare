package com.example.healthcare.healthcare.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoogleMapsController {

    @Value("${google.maps.api.key}")
    private String googleMapsApiKey;

    @GetMapping("/maps")
    public String showMap(Model model) {
        model.addAttribute("apiKey", googleMapsApiKey);
        return "maps"; // Return a Thymeleaf or HTML template for displaying the map
    }
}