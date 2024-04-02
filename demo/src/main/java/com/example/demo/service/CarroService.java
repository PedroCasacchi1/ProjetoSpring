package com.example.demo.service;

import com.example.demo.model.Carro;
import com.example.demo.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService implements AluguelService<Carro> {

    @Autowired
    CarroRepository carroRepository;

    @Override
    public List<Carro> listar() {
        return carroRepository.findAll();
    }

    @Override
    public Carro criar(Carro carro) {
        return carroRepository.save(carro);
    }

    @Override
    public Carro atualizar(Carro carro, Long id) {
        if (carroRepository.existsById(id)) {
            carro.setId(id);
            return carroRepository.save(carro);
        } else {
            return null;
        }
    }

    @Override
    public boolean deletar(Long id) {
        if (carroRepository.existsById(id)) {
            carroRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Optional<Carro> buscaPorId(Long id) {
        return carroRepository.findById(id);
    }

    @Override
    public Optional<Carro> buscaPorPlaca(String placa) {return carroRepository.findByPlaca(placa);
    }

    public List<Carro> buscaPorMarca(String marca) {return carroRepository.findByMarca(marca);
    }

}