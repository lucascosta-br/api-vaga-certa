package com.lucascostabr.vaga_certa.mapper;

import com.lucascostabr.vaga_certa.dto.veiculo.VeiculoRequestDTO;
import com.lucascostabr.vaga_certa.dto.veiculo.VeiculoResponseDTO;
import com.lucascostabr.vaga_certa.model.Morador;
import com.lucascostabr.vaga_certa.model.Veiculo;
import com.lucascostabr.vaga_certa.model.Visitante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VeiculoMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "morador", source = "moradorId")
    @Mapping(target = "visitante", source = "visitanteId")
    Veiculo paraEntity(VeiculoRequestDTO dto);

    VeiculoResponseDTO paraDTO(Veiculo veiculo);

    List<VeiculoResponseDTO> paraListaResponseDTO(List<Veiculo> lista);

    default Morador map(Long id) {
        if (id == null) return null;
        Morador morador = new Morador();
        morador.setId(id);
        return morador;
    }

    default Visitante mapVisitante(Long id) {
        if (id == null) return null;
        Visitante visitante = new Visitante();
        visitante.setId(id);
        return visitante;
    }

}
