package fraga.com.example.ChatBoot.controller;

import fraga.com.example.ChatBoot.assistant.AlunoAssistant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ChatControllerTest {

    @Mock
    private AlunoAssistant assistant;

    @InjectMocks
    private ChatController chatController;

    private String mensagemUsuario;
    private String respostaEsperada;

    @BeforeEach
    void setUp() {
        mensagemUsuario = "Qual é a média dos alunos?";
        respostaEsperada = "A média dos alunos é 8.25";
    }

    @Test
    void generate_DeveRetornarRespostaDoAssistente() {
        // Arrange
        when(assistant.chat(mensagemUsuario)).thenReturn(respostaEsperada);

        // Act
        String resultado = chatController.generate(mensagemUsuario);

        // Assert
        assertNotNull(resultado);
        assertEquals(respostaEsperada, resultado);
        verify(assistant, times(1)).chat(mensagemUsuario);
    }

    @Test
    void generate_ComMensagemVazia_DeveRetornarRespostaDoAssistente() {
        // Arrange
        String mensagemVazia = "";
        String respostaVazia = "Por favor, forneça uma mensagem válida.";
        when(assistant.chat(mensagemVazia)).thenReturn(respostaVazia);

        // Act
        String resultado = chatController.generate(mensagemVazia);

        // Assert
        assertNotNull(resultado);
        assertEquals(respostaVazia, resultado);
        verify(assistant, times(1)).chat(mensagemVazia);
    }
} 