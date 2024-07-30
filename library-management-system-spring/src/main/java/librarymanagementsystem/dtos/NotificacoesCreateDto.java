package librarymanagementsystem.dtos;

import java.time.LocalDateTime;

import librarymanagementsystem.entities.TipoNotificacao;

public record NotificacoesCreateDto(
		TipoNotificacao tipoNotificacao,
		String mensagem,
		LocalDateTime dataEnvio) {

}
