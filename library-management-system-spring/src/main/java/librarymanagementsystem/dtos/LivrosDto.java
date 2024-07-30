package librarymanagementsystem.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import librarymanagementsystem.entities.Categoria;
import librarymanagementsystem.entities.Disponibilidade;

public record LivrosDto(
		@NotNull UUID id,
		String titulo,
		String autor,
		String editora,
		String isbn, //International Standard Book Number
		Categoria categoria,
		Integer quantidade,
		Disponibilidade disponibilidade) {

}
