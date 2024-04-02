package com.example.demo.controller;

import com.example.demo.model.Carro;
import com.example.demo.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    AluguelService<Carro> carroService;

    @GetMapping
    public List<Carro> listarCarros() {
        return carroService.listar();
    }

    @PostMapping
    public Carro criarCarro(@RequestBody Carro carro) {
        return carroService.criar(carro);
    }

    @PutMapping("/{id}")
    public Carro atualizarCarro(@RequestBody Carro carro, @PathVariable Long id) {
        return carroService.atualizar(carro, id);
    }

    @DeleteMapping("/{id}")
    public boolean deletarCarro(@PathVariable Long id) {
        return carroService.deletar(id);
    }

    @GetMapping("/busca-por-id/{id}")
    public Optional<Carro> buscaPorId(@PathVariable Long id) {
        return carroService.buscaPorId(id);
    }


    @GetMapping("/busca-por-placa/{placa}")
    public Optional<Carro> buscaPorPlaca(@PathVariable String placa) {
        return carroService.buscaPorPlaca(placa);
    }

    @GetMapping("/busca-por-marca/{marca}")
    public List<Carro> buscaPorMarca(@PathVariable String marca) {
        return carroService.buscaPorMarca(marca);
    }

}
