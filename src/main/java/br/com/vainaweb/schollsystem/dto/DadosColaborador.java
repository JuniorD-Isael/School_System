package br.com.vainaweb.schollsystem.dto;

import br.com.vainaweb.schollsystem.enums.Cargo;

public record DadosColaborador(String nome, String cpf, String email, Cargo cargo) {

}