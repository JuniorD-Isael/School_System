package br.com.vainaweb.schollsystem.controller;

import java.util.List;

import br.com.vainaweb.schollsystem.dto.DadosAtualizados;
import br.com.vainaweb.schollsystem.dto.DadosColaborador;
import br.com.vainaweb.schollsystem.repository.ColaboradorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.vainaweb.schollsystem.model.ColaboradorModel;
import br.com.vainaweb.schollsystem.service.ColaboradorService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController //Classe controladora gereciada pelo Spring
@RequestMapping("/colaborador")
public class ColaboradorController {

    @Autowired
    private ColaboradorService service;

    @Autowired
    private ColaboradorRepository repository;


    @GetMapping
    public List<ColaboradorModel> listeTodosColaboradores() {
        return service.encontarTodosOsColaboradores();
    }

    //http://localhost:8080/colaborador/1
    // Select * from tb_colaboradores WHERE id = 1;

    @GetMapping("/{id}")
    public ResponseEntity<ColaboradorModel> listarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .map(resposta -> ResponseEntity.status(HttpStatus.OK).body(resposta))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }


    @PostMapping
    public ResponseEntity<String> cadastrarColaborador(@RequestBody DadosColaborador dados) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrar(dados));
    }

    // http://localhost:8080/colaborador/1
    @PutMapping("/{id}")
    public ResponseEntity<Object> atulizar(@PathVariable Long id, @RequestBody @Valid DadosAtualizados dados){
        var colaborador = repository.getReferenceById(id);
        colaborador.atualizarInfo(dados);
        repository.save(colaborador);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id){
        repository.deleteById(id);
        return "Deletado com sucesso!";
    }
}


