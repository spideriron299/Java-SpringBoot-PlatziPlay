package com.platzi_play;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final PlatziPLayAiService aiService;

    public HelloController(PlatziPLayAiService aiService){
        this.aiService = aiService;
    }
    @GetMapping("/")
    public String hello() {
        return this.aiService.generateGreeting();
    }
}
