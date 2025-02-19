package fraga.com.example.ChatBoot.service;

import dev.langchain4j.agent.tool.Tool;
import fraga.com.example.ChatBoot.model.Aluno;
import fraga.com.example.ChatBoot.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Slf4j
@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    @Tool
    public Aluno criarNovoAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public List<Aluno> buscarTodosAlunos(){
        return alunoRepository.findAll();
    }
}
