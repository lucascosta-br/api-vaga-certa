package com.lucascostabr.vaga_certa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "morador")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Morador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 20)
    private String telefone;

    @Column(nullable = false, length = 10)
    private String apartamento;

    @Column(nullable = false, length = 10)
    private String bloco;

    @OneToMany(mappedBy = "morador")
    private Set<Veiculo> veiculos = new HashSet<>();

    @OneToOne(mappedBy = "morador")
    private Vaga vaga;
}
