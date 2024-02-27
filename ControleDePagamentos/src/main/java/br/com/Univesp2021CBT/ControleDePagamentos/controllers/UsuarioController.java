package br.com.Univesp2021CBT.ControleDePagamentos.controllers;

import br.com.Univesp2021CBT.ControleDePagamentos.Usuario.DadosAtualizaUsuario;
import br.com.Univesp2021CBT.ControleDePagamentos.Usuario.DadosCadastroUsuario;
import br.com.Univesp2021CBT.ControleDePagamentos.Usuario.Usuario;
import br.com.Univesp2021CBT.ControleDePagamentos.Usuario.UsuarioRepository;
import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios") @Entity
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroUsuario dados) {

        repository.save(new Usuario(dados));
    }

    @PutMapping
    @Transactional
    public void atualizar (@RequestBody @Valid DadosAtualizaUsuario dados){
        var usuario = repository.getReferenceById(dados.id());
        usuario.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir (@PathVariable Long id){
        var usuario = repository.getReferenceById(dados.id());
        usuario.excluir(dados);

    }
}
