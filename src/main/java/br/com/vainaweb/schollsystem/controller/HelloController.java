package br.com.vainaweb.schollsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloController {

    @GetMapping
    public String saudacao(@RequestParam(value = "name", defaultValue = "Backend") String name) {
        return "Hello, " + name + "!";
    }
}
