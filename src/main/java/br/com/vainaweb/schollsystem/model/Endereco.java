package br.com.vainaweb.schollsystem.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable // Diz que essa classe pode ser encorporada em outra classe
public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String complemento;
    private String uf;
    private Integer numero;
}

