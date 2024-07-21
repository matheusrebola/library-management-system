package librarymanagementsystem.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Renovacoes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime dataRenovacao,
		LocalDateTime novaDataPrevistaDevolucao,
		Emprestimos emprestimo) {

}
