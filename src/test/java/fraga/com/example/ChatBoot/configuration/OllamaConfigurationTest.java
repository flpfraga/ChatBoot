package fraga.com.example.ChatBoot.configuration;

import dev.langchain4j.model.chat.ChatLanguageModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class OllamaConfigurationTest {

    @Autowired
    private ChatLanguageModel chatLanguageModel;

    @Test
    void ollamaChatModel_DeveEstarConfiguradoCorretamente() {
        assertNotNull(chatLanguageModel, "O modelo de chat não deve ser nulo");
    }

    @Test
    void ollamaChatModel_DeveResponderMensagemSimples() {
        // Arrange
        String mensagem = "Olá, como você está?";

        // Act
        String resposta = chatLanguageModel.generate(mensagem);

        // Assert
        assertNotNull(resposta, "A resposta não deve ser nula");
        assertFalse(resposta.isEmpty(), "A resposta não deve estar vazia");
    }
} 