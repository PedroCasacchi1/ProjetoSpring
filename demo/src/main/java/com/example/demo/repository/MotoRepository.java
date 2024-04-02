package com.example.demo.repository;

import com.example.demo.model.Carro;
import com.example.demo.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MotoRepository extends JpaRepository<Moto,Long> {
    Optional<Moto> findByPlaca(String placa);

    List<Moto> findByMarca(String marca);
}
