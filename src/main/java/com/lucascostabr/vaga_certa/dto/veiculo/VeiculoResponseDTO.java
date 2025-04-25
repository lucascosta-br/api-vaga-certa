package com.lucascostabr.vaga_certa.dto.veiculo;

public record VeiculoResponseDTO(
        Long id,
        String marca,
        String modelo,
        String cor,
        String placa
) {
}
