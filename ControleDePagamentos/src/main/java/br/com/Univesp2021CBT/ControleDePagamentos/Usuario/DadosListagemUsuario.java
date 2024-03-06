package br.com.Univesp2021CBT.ControleDePagamentos.Usuario;

public record DadosListagemUsuario (Long id, String nome, String email, Cargo cargo) {
    public DadosListagemUsuario(Usuario usuario) {
        this(usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getCargo());

    }
}
