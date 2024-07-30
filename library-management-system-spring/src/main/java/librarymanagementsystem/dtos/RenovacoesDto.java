package librarymanagementsystem.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import librarymanagementsystem.entities.Emprestimos;

public record RenovacoesDto(
		@NotNull UUID id,
		LocalDateTime dataRenovacao,
		LocalDateTime novaDataPrevistaDevolucao,
		Emprestimos emprestimo) {

}
