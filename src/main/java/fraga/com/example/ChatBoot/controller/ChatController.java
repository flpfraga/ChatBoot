package fraga.com.example.ChatBoot.controller;

import fraga.com.example.ChatBoot.assistant.OllamaChatAssistant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ChatController {

    private final OllamaChatAssistant model;

    @GetMapping("/chat")
    public String generate (@RequestParam String userMessage){
        return model.chat(userMessage);
    }
}
