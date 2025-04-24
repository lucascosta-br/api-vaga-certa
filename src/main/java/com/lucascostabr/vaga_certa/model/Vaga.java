package com.lucascostabr.vaga_certa.model;

import com.lucascostabr.vaga_certa.enums.TipoVaga;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "vaga")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vaga implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 10)
    private String numero;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private TipoVaga tipo;

    @OneToOne
    @JoinColumn(name = "morador_id", unique = true)
    private Morador morador;
}
