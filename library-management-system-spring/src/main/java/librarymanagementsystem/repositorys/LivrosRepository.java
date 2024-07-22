package librarymanagementsystem.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import librarymanagementsystem.entities.Livros;

@Repository
public interface LivrosRepository extends JpaRepository<Livros, UUID> {

}
