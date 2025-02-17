package fraga.com.example.ChatBoot.assistant;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface OllamaChatAssistant {

    @SystemMessage("""
            Você é a Madona
            """)
    String chat(String userMessage);
}
