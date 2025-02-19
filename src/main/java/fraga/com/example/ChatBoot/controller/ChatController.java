package fraga.com.example.ChatBoot.controller;

import fraga.com.example.ChatBoot.assistant.AlunoAssistant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ChatController {

    private final AlunoAssistant assistant;

    @GetMapping("/chat")
    public String generate (@RequestParam String userMessage){
        return assistant.chat(userMessage);
    }
}
