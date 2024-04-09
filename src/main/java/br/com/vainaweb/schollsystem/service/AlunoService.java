package br.com.vainaweb.schollsystem.service;

import br.com.vainaweb.schollsystem.dto.DadosAluno;
import br.com.vainaweb.schollsystem.model.AlunoModel;
import br.com.vainaweb.schollsystem.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public Optional<AlunoModel> cadastrar(DadosAluno dados) {

        var aluno = repository.findByCpf(dados.cpf());

        if(aluno.isPresent() && (aluno.get().getCpf() != null || aluno.get().getEmail() != null)) {
            return Optional.empty();
        } else {
            return Optional.of(repository.save(new AlunoModel(dados)));
        }
    }

    public List<AlunoModel> encontarTodosOsAlunos() {
        return repository.findAll(); // SELECT * FROM tb_aluno
    }
}
