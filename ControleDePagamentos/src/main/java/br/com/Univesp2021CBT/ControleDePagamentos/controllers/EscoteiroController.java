package br.com.Univesp2021CBT.ControleDePagamentos.controllers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/escoteiro")
public class EscoteiroController {
    @Autowired
    EscoteiroRepository repository;

    @GetMapping
    public void listar(){};

    @PutMapping
    @Transactional
    public void alterar(){};

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir( Long id){};

}
