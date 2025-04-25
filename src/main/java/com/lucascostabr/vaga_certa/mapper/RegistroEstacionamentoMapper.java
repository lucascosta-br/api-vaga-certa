package com.lucascostabr.vaga_certa.mapper;

import com.lucascostabr.vaga_certa.dto.registro.RegistroEstacionamentoRequestDTO;
import com.lucascostabr.vaga_certa.dto.registro.RegistroEstacionamentoResponseDTO;
import com.lucascostabr.vaga_certa.model.RegistroEstacionamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RegistroEstacionamentoMapper {

    @Mapping(target = "id", ignore = true)
    RegistroEstacionamento paraEntity(RegistroEstacionamentoRequestDTO dto);

    RegistroEstacionamentoResponseDTO paraDTO(RegistroEstacionamento registroEstacionamento);

    List<RegistroEstacionamentoResponseDTO> paraListaResponseDTO(List<RegistroEstacionamento> lista);

}
