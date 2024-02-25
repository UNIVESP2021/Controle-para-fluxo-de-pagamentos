package br.com.Univesp2021CBT.ControleDePagamentos.controllers;

import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@Entity
public class UsuarioController {
    long id;
    String nome;
    String cargo;
}
