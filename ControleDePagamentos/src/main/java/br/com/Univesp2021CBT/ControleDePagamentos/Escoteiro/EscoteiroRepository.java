package br.com.Univesp2021CBT.ControleDePagamentos.Escoteiro;

import br.com.Univesp2021CBT.ControleDePagamentos.Usuario.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscoteiroRepository {extends JpaRepository<Usuario, Long> {
    Page<Escoteiro> findAllByAtivoTrue(Pageable paginacao);
}
