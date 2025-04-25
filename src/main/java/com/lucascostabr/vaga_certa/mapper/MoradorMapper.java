package com.lucascostabr.vaga_certa.mapper;

import com.lucascostabr.vaga_certa.dto.morador.MoradorRequestDTO;
import com.lucascostabr.vaga_certa.dto.morador.MoradorResponseDTO;
import com.lucascostabr.vaga_certa.model.Morador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface MoradorMapper {


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "veiculos", ignore = true)
    @Mapping(target = "vaga", ignore = true)
    Morador paraEntity(MoradorRequestDTO dto);

    MoradorResponseDTO paraDTO(Morador morador);

    List<MoradorResponseDTO> paraListaMoradorResponseDTO(List<Morador> lista);

}
