package com.lucascostabr.vaga_certa.dto.vaga;


import com.lucascostabr.vaga_certa.enums.TipoVaga;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record VagaRequestDTO(
        @NotBlank String numero,
        @NotNull TipoVaga tipo,
        Long moradorId
) {
}
