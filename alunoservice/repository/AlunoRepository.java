package br.com.juliano.alunoservice.repository;

import br.com.juliano.alunoservice.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {


}
