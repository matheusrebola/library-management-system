package librarymanagementsystem.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Usuarios(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String endereco,
		String email,
		String telefone) {

}
