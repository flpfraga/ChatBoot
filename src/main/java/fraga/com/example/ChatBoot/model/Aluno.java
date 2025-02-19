package fraga.com.example.ChatBoot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public record Aluno(
        @Id
        Long Id,
        String nome,
        String disciplina,
        Float nota) {
}
