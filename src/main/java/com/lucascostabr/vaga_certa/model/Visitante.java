package com.lucascostabr.vaga_certa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "visitante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitante implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 20)
    private String telefone;

    @OneToMany(mappedBy = "visitante")
    private Set<Veiculo> veiculos = new HashSet<>();
}
