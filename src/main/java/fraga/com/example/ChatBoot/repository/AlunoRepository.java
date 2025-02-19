package fraga.com.example.ChatBoot.repository;

import fraga.com.example.ChatBoot.model.Aluno;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends ListCrudRepository<Aluno, Long> {
}
