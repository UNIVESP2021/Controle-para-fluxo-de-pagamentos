package br.com.Univesp2021CBT.ControleDePagamentos.Usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    Page<Usuario> findAllByAtivoTrue(Pageable paginacao);
}
