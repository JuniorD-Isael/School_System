package br.com.vainaweb.schollsystem.service;

import br.com.vainaweb.schollsystem.dto.DadosColaborador;
import br.com.vainaweb.schollsystem.model.ColaboradorModel;
import br.com.vainaweb.schollsystem.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Classe de serviço gerenciada pelo Spring
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository repository;

    public List<ColaboradorModel> encontarTodosOsColaboradores() {
        return repository.findAll(); // SELECT * FROM tb_colaborador
    }

    public String cadastrar(DadosColaborador dados) {

        // SELECT * FROM tb_colaborador WHERE cpf = ??
        var existente = repository.findByCpf(dados.cpf());

        if (existente.isPresent()) {
            return "CPF já cadastrado!";
        } else {
            var colaborador = new ColaboradorModel(dados.nome(), dados.email(), dados.cpf(), dados.cargo());
            repository.save(colaborador); // INSERT INTO tb_colaborador (nome, email, cpf, cargo) VALUES (dados.nome, dados.email, dados.cpf, dados.cargo)
            return "Colaborador cadastrado com sucesso!";
        }
    }
}
