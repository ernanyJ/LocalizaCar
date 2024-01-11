package com.twice.dev.LocalizaCar.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Requester {

    @Id
    @Column(unique = true, name = "solicitante_cpf")
    private String cpf;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String reason;

    @Column
    private String role;


}
