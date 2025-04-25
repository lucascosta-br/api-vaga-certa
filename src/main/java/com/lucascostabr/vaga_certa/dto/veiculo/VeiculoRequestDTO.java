package com.lucascostabr.vaga_certa.dto.veiculo;

import jakarta.validation.constraints.NotBlank;

public record VeiculoRequestDTO(
        @NotBlank String marca,
        @NotBlank String modelo,
        @NotBlank String cor,
        @NotBlank String placa,
        Long moradorId,
        Long visitanteId
) {
}
