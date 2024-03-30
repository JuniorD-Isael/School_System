package br.com.vainaweb.schollsystem.controller;

import java.util.List;

import br.com.vainaweb.schollsystem.dto.DadosColaborador;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.vainaweb.schollsystem.model.ColaboradorModel;
import br.com.vainaweb.schollsystem.service.ColaboradorService;

import org.springframework.web.bind.annotation.*;


@RestController //Classe controladora gereciada pelo Spring
@RequestMapping("/colaborador-teste")
public class ColaboradorController {

    @Autowired
    private ColaboradorService service;

    @GetMapping
    public List<ColaboradorModel> listeTodosColaboradores(){
        return service.encontarTodosOsColaboradores();
    }

    @PostMapping
    public String cadastrarColaborador(@RequestBody DadosColaborador dados){
        service.cadastrar(dados);
        return "ok";
    }
}
