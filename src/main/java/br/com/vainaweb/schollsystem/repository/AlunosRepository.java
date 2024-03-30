package br.com.vainaweb.schollsystem.repository;

import br.com.vainaweb.schollsystem.model.AlunosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Trata a interface como a camada de persistência
public interface AlunosRepository extends JpaRepository<AlunosModel, Long> {
}
