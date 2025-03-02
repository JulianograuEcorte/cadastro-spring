package br.com.juliano.alunoservice.service;

import br.com.juliano.alunoservice.repository.AlunoRepository;
import org.springframework.stereotype.Service;
import br.com.juliano.alunoservice.entity.Aluno;

@Service
public record AlunoService(AlunoRepository alunoRepository) {

    public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

}
