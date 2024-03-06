package br.com.Univesp2021CBT.ControleDePagamentos.controllers;

import br.com.Univesp2021CBT.ControleDePagamentos.Usuario.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroUsuario dados) {

        repository.save(new Usuario(dados));
    }

    @GetMapping
    public Page<DadosListagemUsuario> listar (@PageableDefault(size =10, sort = {"nome"})Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemUsuario::new);
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
        var usuario = repository.getReferenceById(id);
        usuario.excluir();

    }
}
