package librarymanagementsystem.dtos;

import java.time.LocalDateTime;

import librarymanagementsystem.entities.TipoRelatorio;

public record RelatoriosCreateDto(
		TipoRelatorio tipoRelatorio,
		LocalDateTime dataGeracao,
		String conteudo) {

}
