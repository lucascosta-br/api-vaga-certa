package com.lucascostabr.vaga_certa.dto.vaga;

import com.lucascostabr.vaga_certa.enums.TipoVaga;

public record VagaResponseDTO(
        Long id,
        String numero,
        TipoVaga tipo,
        String nomeMorador // se FIXA
) {
}
