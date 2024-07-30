package librarymanagementsystem.dtos;

import librarymanagementsystem.entities.Categoria;
import librarymanagementsystem.entities.Disponibilidade;

public record LivrosCreateDto(
		String titulo,
		String autor,
		String editora,
		String isbn, //International Standard Book Number
		Categoria categoria,
		Integer quantidade,
		Disponibilidade disponibilidade) {

}
