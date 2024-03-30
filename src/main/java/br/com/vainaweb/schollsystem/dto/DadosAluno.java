package br.com.vainaweb.schollsystem.dto;

import br.com.vainaweb.schollsystem.enums.Curso;

public record DadosAluno(String nome, String cpf, String email, Curso curso, String telefone){}
