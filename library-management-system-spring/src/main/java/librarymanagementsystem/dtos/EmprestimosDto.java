package librarymanagementsystem.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import librarymanagementsystem.entities.Livros;
import librarymanagementsystem.entities.Usuarios;

public record EmprestimosDto(
		@NotNull UUID id,
		LocalDateTime dataEmprestimo,
		LocalDateTime dataPrevistaDevolucao,
		LocalDateTime dataDevolucao,
		Integer renovacoes,
		Usuarios usuario,
		Livros livro) {

}
