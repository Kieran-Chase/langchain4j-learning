package pers.kieran.study.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.kieran.study.service.ChatAssistant;

@RestController
public class DeclarativeAIServiceController
{
    @Resource
    private ChatAssistant chatAssistantQwen;

    // http://localhost:9003/lc4j/boot/declarative
    @GetMapping(value = "/lc4j/boot/declarative")
    public String declarative(@RequestParam(value = "prompt", defaultValue = "你是谁") String prompt)
    {
        return chatAssistantQwen.chat(prompt);
    }
}
