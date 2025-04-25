package com.lucascostabr.vaga_certa.dto.registro;

import java.time.LocalDateTime;

public record RegistroResponseDTO(
        Long id,
        LocalDateTime dataEntrada,
        LocalDateTime dataSaida,
        String placaVeiculo,
        String nomeVisitante,
        String nomeMorador,
        String numeroVaga
) {
}
