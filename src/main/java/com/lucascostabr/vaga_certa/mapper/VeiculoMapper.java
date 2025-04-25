package com.lucascostabr.vaga_certa.mapper;

import com.lucascostabr.vaga_certa.dto.veiculo.VeiculoRequestDTO;
import com.lucascostabr.vaga_certa.dto.veiculo.VeiculoResponseDTO;
import com.lucascostabr.vaga_certa.model.Veiculo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VeiculoMapper {

    @Mapping(target = "id", ignore = true)
    Veiculo paraEntity(VeiculoRequestDTO dto);

    VeiculoResponseDTO paraDTO(Veiculo veiculo);

    List<VeiculoResponseDTO> paraListaResponseDTO(List<Veiculo> lista);

}
