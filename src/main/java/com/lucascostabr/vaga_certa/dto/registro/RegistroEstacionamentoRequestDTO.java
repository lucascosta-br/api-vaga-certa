package com.lucascostabr.vaga_certa.dto.registro;

import jakarta.validation.constraints.NotBlank;

public record RegistroEstacionamentoRequestDTO(
        @NotBlank Long vagaId,
        @NotBlank Long veiculoId,
        Long moradorId,
        Long visitanteId
) {
}
