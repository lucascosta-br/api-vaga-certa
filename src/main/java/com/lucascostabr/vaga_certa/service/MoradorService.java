package com.lucascostabr.vaga_certa.service;

import com.lucascostabr.vaga_certa.dto.morador.MoradorRequestDTO;
import com.lucascostabr.vaga_certa.dto.morador.MoradorResponseDTO;
import com.lucascostabr.vaga_certa.exception.RequisicaoInvalidaException;
import com.lucascostabr.vaga_certa.exception.handle.RecursoNaoEncontradoException;
import com.lucascostabr.vaga_certa.mapper.MoradorMapper;
import com.lucascostabr.vaga_certa.repository.MoradorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoradorService {

    private Logger logger = LoggerFactory.getLogger(MoradorService.class.getName());

    @Autowired
    private MoradorRepository repository;

    @Autowired
    private MoradorMapper mapper;

    public MoradorResponseDTO criarMorador(MoradorRequestDTO dto) {
        logger.info("Criando um Morador!");

        if (dto == null) {
            throw new RequisicaoInvalidaException("DTO do morador é obrigatório");
        }

        var entity = mapper.paraEntity(dto);
        var salvo = repository.save(entity);
        return mapper.paraDTO(salvo);
    }

    public List<MoradorResponseDTO> listarMoradores() {
        logger.info("Listando Moradores!");

        var dto = repository.findAll();
        return mapper.paraListaMoradorResponseDTO(dto);
    }

    public MoradorResponseDTO listarPorID(Long id) {
        logger.info("Listando Um Morador!");

        var entity = repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Morador com id: " + id + " não encontrado."));

        return mapper.paraDTO(entity);

    }

    public MoradorResponseDTO utualizarMorador(Long id, MoradorRequestDTO dto) {
        logger.info("Atualizando Um Morador!");

        if (dto == null) {
            throw new RequisicaoInvalidaException("DTO do morador é obrigatório");
        }

        var entity = repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Morador com id: " + id + " não encontrado."));

        entity.setNome(dto.nome());
        entity.setTelefone(dto.telefone());
        entity.setApartamento(dto.apartamento());
        entity.setBloco(dto.bloco());

        var salvo = repository.save(entity);

        return mapper.paraDTO(salvo);

    }

    public void deletarMorador(Long id) {
        logger.info("Deletando Um Morador!");

        repository.deleteById(id);
    }

}
