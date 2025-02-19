package fraga.com.example.ChatBoot.assistant;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface AlunoAssistant {

    @SystemMessage("""
            Você é um sistema de gerenciamento educacional que ajuda a gerenciar alunos e notas obtidas nas disciplinas.
            """)
    String chat(String userMessage);
}
