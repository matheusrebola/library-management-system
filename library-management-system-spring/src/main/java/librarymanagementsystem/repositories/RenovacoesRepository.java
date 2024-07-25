package librarymanagementsystem.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import librarymanagementsystem.entities.Renovacoes;

@Repository
public interface RenovacoesRepository extends JpaRepository<Renovacoes, UUID> {

}
