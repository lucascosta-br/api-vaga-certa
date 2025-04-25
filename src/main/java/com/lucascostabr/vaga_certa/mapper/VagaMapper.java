package com.lucascostabr.vaga_certa.mapper;

import com.lucascostabr.vaga_certa.dto.vaga.VagaRequestDTO;
import com.lucascostabr.vaga_certa.dto.vaga.VagaResponseDTO;
import com.lucascostabr.vaga_certa.model.Vaga;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VagaMapper {

    @Mapping(target = "id", ignore = true)
    Vaga paraEntity(VagaRequestDTO dto);

    VagaResponseDTO paraDTO(Vaga vaga);

    List<VagaResponseDTO> paraListaMoradorResponseDTO(List<Vaga> lista);

}
