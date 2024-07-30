package librarymanagementsystem.dtos;

import java.time.LocalDateTime;

import librarymanagementsystem.entities.Emprestimos;

public record RenovacoesCreateDto(
		LocalDateTime dataRenovacao,
		LocalDateTime novaDataPrevistaDevolucao,
		Emprestimos emprestimo) {

}
