package com.lucascostabr.vaga_certa.dto.visitante;

import com.lucascostabr.vaga_certa.dto.veiculo.VeiculoResponseDTO;

import java.util.List;

public record VisitanteResponseDTO(
        Long id,
        String nome,
        String telefone,
        List<VeiculoResponseDTO> veiculos
) {
}
