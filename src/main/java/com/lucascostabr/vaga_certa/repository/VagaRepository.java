package com.lucascostabr.vaga_certa.repository;

import com.lucascostabr.vaga_certa.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<Vaga, Long> {
    Vaga findByNumero(String numero);
}
