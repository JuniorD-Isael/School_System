package br.com.vainaweb.schollsystem.repository;

import java.util.Optional;

import br.com.vainaweb.schollsystem.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository // Trata a interface como a camada de persistência
public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {

    Optional<AlunoModel> findByCpf(String cpf);
}
