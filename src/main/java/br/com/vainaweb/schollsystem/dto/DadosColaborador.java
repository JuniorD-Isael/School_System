package br.com.vainaweb.schollsystem.dto;

import br.com.vainaweb.schollsystem.enums.Cargo;
import jakarta.validation.Valid;

public record DadosColaborador(String nome, String cpf, String email, Cargo cargo,@Valid EnderecoDTO endereco) {
}