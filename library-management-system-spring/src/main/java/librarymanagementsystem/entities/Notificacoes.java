package librarymanagementsystem.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Notificacoes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		TipoNotificacao tipoNotificacao,
		String mensagem,
		LocalDateTime dataEnvio) {

}
