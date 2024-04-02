package com.example.demo.controller;

import com.example.demo.model.Carro;
import com.example.demo.model.Moto;
import com.example.demo.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/motos")
public class MotoController {

    @Autowired
    AluguelService<Moto> motoService;

    @GetMapping
    public List<Moto> listarMotos () {
        return motoService.listar();
    }

    @PostMapping
    public Moto criar (@RequestBody Moto moto) {
        return motoService.criar(moto);
    }

    @PutMapping("/{id}")
    public Moto atualizar (@PathVariable Long id, @RequestBody Moto moto) { return motoService.atualizar(moto, id); }

    @DeleteMapping("/{id}")
    public boolean deletarMoto(@PathVariable Long id) {
        return motoService.deletar(id);
    }

    @GetMapping("/busca-por-id/{id}")
    public Optional<Moto> buscaPorId(@PathVariable Long id) {
        return motoService.buscaPorId(id);
    }

    @GetMapping("/busca-por-placa/{placa}")
    public Optional<Moto> buscaPorPlaca(@PathVariable String placa) {
        return motoService.buscaPorPlaca(placa);
    }

    @GetMapping("/busca-por-marca/{marca}")
    public List<Moto> buscaPorMarca(@PathVariable String marca) {
        return motoService.buscaPorMarca(marca);
    }
}

