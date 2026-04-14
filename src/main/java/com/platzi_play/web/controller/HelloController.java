package com.platzi_play.web.controller;


import com.platzi_play.domain.service.PlatziPLayAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final String plataform;
    private final PlatziPLayAiService aiService;

    public HelloController(@Value("${spring.application.name}") String plataform, PlatziPLayAiService aiService){
        this.plataform = plataform;
        this.aiService = aiService;
    }
    @GetMapping("/hello")
    public String hello() {
        return this.aiService.generateGreeting(plataform);
    }
}
