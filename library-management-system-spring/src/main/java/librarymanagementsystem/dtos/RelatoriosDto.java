package librarymanagementsystem.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import librarymanagementsystem.entities.TipoRelatorio;

public record RelatoriosDto(
		@NotNull UUID id,
		TipoRelatorio tipoRelatorio,
		LocalDateTime dataGeracao,
		String conteudo) {

}
