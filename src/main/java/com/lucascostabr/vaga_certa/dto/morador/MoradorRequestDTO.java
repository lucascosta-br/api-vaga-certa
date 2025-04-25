package com.lucascostabr.vaga_certa.dto.morador;

import jakarta.validation.constraints.NotBlank;

public record MoradorRequestDTO(
        @NotBlank String nome,
        @NotBlank String telefone,
        @NotBlank String apartamento,
        @NotBlank String bloco
) {
}
