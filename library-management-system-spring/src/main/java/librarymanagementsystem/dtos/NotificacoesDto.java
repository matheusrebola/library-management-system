package librarymanagementsystem.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import librarymanagementsystem.entities.TipoNotificacao;

public record NotificacoesDto(
		@NotNull UUID id,
		TipoNotificacao tipoNotificacao,
		String mensagem,
		LocalDateTime dataEnvio) {

}
