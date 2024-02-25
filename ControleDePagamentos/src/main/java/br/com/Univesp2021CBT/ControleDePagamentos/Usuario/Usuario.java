package br.com.Univesp2021CBT.ControleDePagamentos.Usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity(name = "usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY);
    private long id;
    private String nome;
    private String email;
    @Enumerated(EnumType.STRING)
    Cargo cargo;
    private Boolean Ativo;

    public Usuario(DadosCadastroUsuario dados) {
        this.Ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.cargo = dados.cargo();
    }

}
