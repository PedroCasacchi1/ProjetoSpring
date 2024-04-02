package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Carro extends Aluguel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Carro(Long id) {
        this.id = id;
    }

    public Carro() {

    }

    public Carro(String marca, String modelo, int ano, String cor, String placa, String nomecliente, Long id, int diasAlugado) {
        super(marca, modelo, ano, cor, placa, nomecliente, diasAlugado);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
