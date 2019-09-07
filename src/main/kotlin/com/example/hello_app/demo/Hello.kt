package com.example.hello_app.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Hello {
    @GetMapping("/")
    fun index(model: Model) : String {
        model.addAttribute("Greeting", "Hello World!")
        return "index"
    }
}