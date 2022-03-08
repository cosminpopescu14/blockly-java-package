package com.blockly.blockly;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {

    @GetMapping
    public String home() {
        return "home.html"; // for static pages
    }
}
