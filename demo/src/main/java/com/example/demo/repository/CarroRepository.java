package com.example.demo.repository;

import com.example.demo.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarroRepository extends JpaRepository<Carro,Long> {
    Optional<Carro> findByPlaca(String placa);
    List<Carro> findByMarca(String marca);
}
