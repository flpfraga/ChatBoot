package fraga.com.example.ChatBoot.service;

import fraga.com.example.ChatBoot.model.Aluno;
import fraga.com.example.ChatBoot.repository.AlunoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AlunoServiceTest {

    @Mock
    private AlunoRepository alunoRepository;

    @InjectMocks
    private AlunoService alunoService;

    private Aluno aluno;

    @BeforeEach
    void setUp() {
        aluno = new Aluno(1L, "João Silva", "Matemática", 8.5f);
    }

    @Test
    void criarNovoAluno_DeveRetornarAlunoSalvo() {
        // Arrange
        when(alunoRepository.save(any(Aluno.class))).thenReturn(aluno);

        // Act
        Aluno resultado = alunoService.criarNovoAluno(aluno);

        // Assert
        assertNotNull(resultado);
        assertEquals(aluno.Id(), resultado.Id());
        assertEquals(aluno.nome(), resultado.nome());
        assertEquals(aluno.disciplina(), resultado.disciplina());
        assertEquals(aluno.nota(), resultado.nota());
        verify(alunoRepository, times(1)).save(any(Aluno.class));
    }

    @Test
    void buscarTodosAlunos_DeveRetornarListaDeAlunos() {
        // Arrange
        List<Aluno> alunos = Arrays.asList(
            aluno,
            new Aluno(2L, "Maria Santos", "Português", 9.0f)
        );
        when(alunoRepository.findAll()).thenReturn(alunos);

        // Act
        List<Aluno> resultado = alunoService.buscarTodosAlunos();

        // Assert
        assertNotNull(resultado);
        assertEquals(2, resultado.size());
        verify(alunoRepository, times(1)).findAll();
    }
} 