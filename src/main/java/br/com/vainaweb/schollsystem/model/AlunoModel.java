package br.com.vainaweb.schollsystem.model;

import br.com.vainaweb.schollsystem.dto.DadosAluno;
import br.com.vainaweb.schollsystem.dto.DadosAtualizados;
import br.com.vainaweb.schollsystem.enums.Curso;
import jakarta.persistence.*;

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
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public AlunoModel(DadosAluno dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.curso = dados.curso();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco().cep(), dados.endereco().logradouro(), dados.endereco().bairro(),
                dados.endereco().cidade(), dados.endereco().complemento(), dados.endereco().uf(), dados.endereco().numero());
    }

        public void atualizarInfo(DadosAtualizados dados) {
        this.nome = dados.nome() != null ? dados.nome() : this.nome;
        this.email = dados.email();
    }
}
