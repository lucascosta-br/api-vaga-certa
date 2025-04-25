package com.lucascostabr.vaga_certa.dto.visitante;

import jakarta.validation.constraints.NotBlank;

public record VisitanteRequestDTO(
        @NotBlank String nome,
        @NotBlank String telefone
) {
}
