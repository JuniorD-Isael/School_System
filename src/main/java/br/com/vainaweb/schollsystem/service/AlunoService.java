package br.com.vainaweb.schollsystem.service;

import br.com.vainaweb.schollsystem.dto.DadosAluno;
import br.com.vainaweb.schollsystem.model.AlunosModel;
import br.com.vainaweb.schollsystem.repository.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunosRepository repository;

    public List<AlunosModel> encontarTodosOsAlunos() {
        return repository.findAll(); // SELECT * FROM tb_aluno
    }

    public void cadastrar(DadosAluno dados) {
        var aluno = new AlunosModel(dados.nome(), dados.email(), dados.cpf(), dados.curso(), dados.telefone());
        repository.save(aluno); // INSERT INTO tb_aluno (nome, email, cpf, curso, telefone) VALUES (dados.nome, dados.email, dados.cpf, dados.curso, dados.telefone)
    }
}
