package librarymanagementsystem.dtos;

import java.time.LocalDateTime;

import librarymanagementsystem.entities.Livros;
import librarymanagementsystem.entities.Usuarios;

public record EmprestimosCreateDto(
		LocalDateTime dataEmprestimo,
		LocalDateTime dataPrevistaDevolucao,
		LocalDateTime dataDevolucao,
		Integer renovacoes,
		Usuarios usuario,
		Livros livro) {

}
