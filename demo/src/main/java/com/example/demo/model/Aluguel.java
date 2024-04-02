package com.example.demo.model;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;

@MappedSuperclass
public abstract class Aluguel {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private String nomecliente;
    private int diasAlugado;

    public Aluguel() {

    }

    public Aluguel(String marca, String modelo, int ano, String cor, String placa, String nomecliente, int diasAlugado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.nomecliente = nomecliente;
        this.diasAlugado = diasAlugado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }

    public void setDiasAlugado(int diasAlugado) {
        this.diasAlugado = diasAlugado;
    }
}

