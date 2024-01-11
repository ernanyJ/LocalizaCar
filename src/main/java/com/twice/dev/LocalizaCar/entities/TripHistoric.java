package com.twice.dev.LocalizaCar.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class TripHistoric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id")
    private Car car;

    @OneToOne
    @JoinColumn(name = "cpf_motorista")
    private Driver driver;

    @OneToOne
    @JoinColumn(name = "solicitante_cpf")
    private Requester requester;

    @CreationTimestamp
    @NotNull
    private LocalDateTime date;

    private String origin;

    private String destiny;



}
