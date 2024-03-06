package br.com.Univesp2021CBT.ControleDePagamentos.Usuario;
import jakarta.validation.constraints.NotNull;
public record DadosAtualizaUsuario(
    @NotNull
    Long id,

    String nome,

    String email,

    Cargo cargo

    ){
}
