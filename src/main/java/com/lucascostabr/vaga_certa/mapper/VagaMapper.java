package com.lucascostabr.vaga_certa.mapper;

import com.lucascostabr.vaga_certa.dto.vaga.VagaRequestDTO;
import com.lucascostabr.vaga_certa.dto.vaga.VagaResponseDTO;
import com.lucascostabr.vaga_certa.model.Morador;
import com.lucascostabr.vaga_certa.model.Vaga;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VagaMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "morador", source = "moradorId")
    Vaga paraEntity(VagaRequestDTO dto);

    @Mapping(source = "morador.nome", target = "nomeMorador")
    VagaResponseDTO paraDTO(Vaga vaga);

    List<VagaResponseDTO> paraListaMoradorResponseDTO(List<Vaga> lista);

    default Morador map(Long id) {
        if (id == null) return null;
        Morador morador = new Morador();
        morador.setId(id);
        return morador;
    }

}
