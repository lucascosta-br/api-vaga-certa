package com.lucascostabr.vaga_certa.mapper;

import com.lucascostabr.vaga_certa.dto.morador.MoradorRequestDTO;
import com.lucascostabr.vaga_certa.dto.morador.MoradorResponseDTO;
import com.lucascostabr.vaga_certa.model.Morador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MoradorMapper {

    @Mapping(target = "id", ignore = true)
    Morador paraEntity(MoradorRequestDTO dto);

    MoradorResponseDTO paraDTO(Morador morador);

    List<MoradorResponseDTO> paraListaMoradorResponseDTO(List<Morador> lista);

}
