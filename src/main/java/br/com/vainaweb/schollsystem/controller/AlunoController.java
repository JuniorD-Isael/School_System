package br.com.vainaweb.schollsystem.controller;

import br.com.vainaweb.schollsystem.dto.DadosAluno;
import br.com.vainaweb.schollsystem.dto.DadosAtualizados;
import br.com.vainaweb.schollsystem.model.AlunoModel;
import br.com.vainaweb.schollsystem.repository.AlunoRepository;
import br.com.vainaweb.schollsystem.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private AlunoService service;

    @GetMapping
    public List<AlunoModel> listeTodosAlunos() {
        return service.encontarTodosOsAlunos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoModel> findById(@PathVariable Long id) {
        return repository.findById(id).map(resposta -> ResponseEntity.status(HttpStatus.OK).body(resposta))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<Object> cadastrar(@RequestBody DadosAluno dados) {
        return service.cadastrar(dados).map(resposta -> ResponseEntity.status(HttpStatus.CREATED).build())
                .orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
    }

        // http://localhost:8080/aluno/1
    @PutMapping("/{id}")
    public ResponseEntity<Object> atulizar(@PathVariable Long id, @RequestBody @Valid DadosAtualizados dados){
        var aluno = repository.getReferenceById(id);
        aluno.atualizarInfo(dados);
        repository.save(aluno);
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id){
        repository.deleteById(id);
        return "Deletado com sucesso!";
    }
}
