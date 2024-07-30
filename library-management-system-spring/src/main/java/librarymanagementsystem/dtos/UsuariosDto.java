package librarymanagementsystem.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record UsuariosDto(
		@NotNull UUID id,
		String nome,
		String endereco,
		String email,
		String telefone) {

}
