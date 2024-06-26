package com.example.demo.service;

import com.example.demo.model.Carro;
import com.example.demo.model.Moto;
import com.example.demo.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotoService implements AluguelService<Moto>{

    @Autowired
    MotoRepository motoRepository;

    @Override
    public List<Moto> listar() {
       return motoRepository.findAll();
    }

    @Override
    public Moto criar(Moto moto) {
        return motoRepository.save(moto);
    }

    @Override
    public Moto atualizar(Moto moto, Long id) {
        if(motoRepository.existsById(id)) {
            moto.setId(id);
            return motoRepository.save(moto);
        } else {
            return null;
        }
    }

    @Override
    public boolean deletar(Long id) {
        if(motoRepository.existsById(id)) {
            motoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Optional<Moto> buscaPorId(Long id) {
        return motoRepository.findById(id);
    }

    @Override
    public Optional<Moto> buscaPorPlaca(String placa) {return motoRepository.findByPlaca(placa);
    }

    @Override
    public List<Moto> buscaPorMarca(String marca) {return motoRepository.findByMarca(marca);
    }


}
