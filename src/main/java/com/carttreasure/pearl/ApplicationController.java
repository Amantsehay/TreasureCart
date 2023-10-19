package com.carttreasure.pearl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// what about now
@SpringBootApplication
@Controller  // what if I make this a controller

public class ApplicationController {
    // this method is creating circular view
    // this below method will return index.html file I guess
@GetMapping("/index")
    public String viewResolver(Model model){
        return "index";
    }
}
