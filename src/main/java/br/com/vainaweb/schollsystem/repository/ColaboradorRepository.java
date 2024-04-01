package br.com.vainaweb.schollsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vainaweb.schollsystem.model.ColaboradorModel;

import java.util.Optional;


@Repository // Trata a interface como a camada de persistência
public interface ColaboradorRepository extends JpaRepository<ColaboradorModel, Long> {

    Optional<ColaboradorModel> findByCpf(String cpf);
}
