package librarymanagementsystem.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Livros(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String titulo,
		String autor,
		String editora,
		String isbn, //International Standard Book Number
		Categoria categoria,
		Integer quantidade,
		Disponibilidade disponibilidade) {

}
