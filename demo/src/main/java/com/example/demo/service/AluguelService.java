package com.example.demo.service;

import com.example.demo.model.Aluguel;
import com.example.demo.model.Carro;

import java.util.List;
import java.util.Optional;

public interface AluguelService <T extends Aluguel> {
    List<T> listar();
    T criar(T t);
    T atualizar(T t, Long id);
    boolean deletar(Long id);

    Optional<T> buscaPorId(Long id);

   Optional<T> buscaPorPlaca(String placa);

    List<T> buscaPorMarca(String marca);

}
