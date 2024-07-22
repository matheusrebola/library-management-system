package librarymanagementsystem.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import librarymanagementsystem.entities.Notificacoes;

@Repository
public interface NotificacoesRepository extends JpaRepository<Notificacoes, UUID> {

}
