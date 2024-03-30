package br.com.vainaweb.schollsystem.controller;

import br.com.vainaweb.schollsystem.dto.DadosAluno;
import br.com.vainaweb.schollsystem.model.AlunosModel;
import br.com.vainaweb.schollsystem.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno-test")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public List<AlunosModel> listeTodosAlunos(){
        return service.encontarTodosOsAlunos();
    }

    @PostMapping
    public String cadastrarAluno(@RequestBody DadosAluno dados){
        service.cadastrar(dados);
        return "ok";
    }
}
