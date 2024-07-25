package librarymanagementsystem.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import librarymanagementsystem.entities.Emprestimos;

@Repository
public interface EmprestimosRepository extends JpaRepository<Emprestimos, UUID> {

}
