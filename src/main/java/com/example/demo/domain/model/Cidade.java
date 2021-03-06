package com.example.demo.domain.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String nome;
    @Column
    private StatusEnum status;
    @Column
    private LocalDateTime dataCadastro;
    @ManyToOne
    @JoinColumn(name = "idEstadado")
    private Estado estado;

}
