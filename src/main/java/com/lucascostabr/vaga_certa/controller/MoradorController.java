package com.lucascostabr.vaga_certa.controller;

import com.lucascostabr.vaga_certa.dto.morador.MoradorRequestDTO;
import com.lucascostabr.vaga_certa.dto.morador.MoradorResponseDTO;
import com.lucascostabr.vaga_certa.service.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/morador")
public class MoradorController {

    @Autowired
    private MoradorService service;

    @PostMapping
    public ResponseEntity<MoradorResponseDTO> criarMorador(@RequestBody MoradorRequestDTO request) {
        return ResponseEntity.status(HttpStatus.CREATED).body( service.criarMorador(request));
    }

    @GetMapping
    public ResponseEntity<List<MoradorResponseDTO>> listarMoradores() {
        return ResponseEntity.ok(service.listarMoradores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MoradorResponseDTO> listarPorID(@PathVariable Long id) {
        return ResponseEntity.ok(service.listarPorID(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MoradorResponseDTO> atualizarMorador(@PathVariable Long id,
                                                        @RequestBody MoradorRequestDTO request) {
        return ResponseEntity.ok(service.utualizarMorador(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarMorador(@PathVariable Long id) {
        service.deletarMorador(id);
        return ResponseEntity.noContent().build();
    }

}
