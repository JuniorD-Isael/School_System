package br.com.vainaweb.schollsystem.model;

import br.com.vainaweb.schollsystem.enums.Curso;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "tb_alunos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlunosModel {

    @Id
    private Long id;

    private String nome;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @CPF
    @Column(unique = true, nullable = false)
    private String cpf;

    private Curso curso;

    private String telefone;

    @Embedded
    private Endereco endereco;

    public AlunosModel(String nome, String email, String cpf, Curso curso, String telefone) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.curso = curso;
        this.telefone = telefone;
    }
}
