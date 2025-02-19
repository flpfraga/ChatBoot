package fraga.com.example.ChatBoot.configuration;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class OllamaConfiguration {

    @Value("${langchain4j.ollama.chat-model.base-url}")
    private String URL;

    @Value("${langchain4j.ollama.chat-model.model-name}")
    private String MODEL_NAME;

    @Value("${langchain4j.ollama.chat-model.temperature}")
    private Double TEMPERATURE;

    @Value("${langchain4j.ollama.chat-model.timeout}")
    private Duration TIME_OUT;

    @Bean
    public ChatLanguageModel ollamaChatModel(){
        return OllamaChatModel.builder()
                .baseUrl(URL)  // Padrão do Ollama
                .modelName(MODEL_NAME)
                .timeout(TIME_OUT)
                .temperature(TEMPERATURE)
                .build();
    }
}
