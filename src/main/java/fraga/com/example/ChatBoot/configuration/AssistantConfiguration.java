package fraga.com.example.ChatBoot.configuration;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AssistantConfiguration {

    @Bean
    ChatMemory chatMemory (){
        return MessageWindowChatMemory.withMaxMessages(3);
    }
}
