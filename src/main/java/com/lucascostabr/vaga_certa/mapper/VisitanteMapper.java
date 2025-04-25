package com.lucascostabr.vaga_certa.mapper;

import com.lucascostabr.vaga_certa.dto.visitante.VisitanteRequestDTO;
import com.lucascostabr.vaga_certa.dto.visitante.VisitanteResponseDTO;
import com.lucascostabr.vaga_certa.model.Visitante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VisitanteMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "veiculos", ignore = true)
    Visitante paraEntity(VisitanteRequestDTO dto);

    VisitanteResponseDTO paraDTO(Visitante visitante);

    List<VisitanteResponseDTO> paraListaResponseDTO(List<Visitante> lista);

}
