package com.lucascostabr.vaga_certa.dto.morador;

import com.lucascostabr.vaga_certa.dto.veiculo.VeiculoResponseDTO;

import java.util.List;

public record MoradorResponseDTO(
        Long id,
        String nome,
        String apartamento,
        String bloco,
        List<VeiculoResponseDTO> veiculos
) {
}
