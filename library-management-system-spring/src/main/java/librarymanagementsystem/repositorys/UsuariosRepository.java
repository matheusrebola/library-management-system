package librarymanagementsystem.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import librarymanagementsystem.entities.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, UUID> {

}
