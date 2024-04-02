package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Moto extends Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Moto() {
    }

    public Moto(String marca, String modelo, int ano, String cor, String placa, String nomecliente, int diasalugado) {
        super(marca, modelo, ano, cor, placa, nomecliente, diasalugado);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
