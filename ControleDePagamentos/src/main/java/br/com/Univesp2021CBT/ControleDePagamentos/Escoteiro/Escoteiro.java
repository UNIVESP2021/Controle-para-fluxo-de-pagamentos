package br.com.Univesp2021CBT.ControleDePagamentos.Escoteiro;

import br.com.Univesp2021CBT.ControleDePagamentos.Usuario.DadosAtualizaUsuario;
import br.com.Univesp2021CBT.ControleDePagamentos.Usuario.DadosCadastroUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "escoteiros")
@Entity(name = "escoteiro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Escoteiro {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date nascimento;
    private Date filiacao;
    private String email;
    @Enumerated(EnumType.STRING)
    Enum ramo;
    private Boolean Ativo;

    public Escoteiro(DadosEscoteiro dados) {
        this.Ativo = true;
        this.nome = dados.nome();
        this.nascimento = dados.nascimento();
        this.filiacao = dados.filiacao();
        this.ramo = dados.ramo();
        this.email = dados.email();

        public void atualizarInformacoes(DadosEscoteiro dados) {
            if (dados.nome() != null) {
                this.nome = dados.nome();
            }
            if (dados.nascimento() != null) {
                this.nascimento = dados.nascimento();
            }
            if (dados.filiacao() != null) {
                this.filiacao = dados.filiacao();
            }
            if (dados.ramo() != null) {
                this.ramo.atualizarInformacoes(dados.ramo());
            }
            if (dados.email() != null) {
                this.email = dados.email();
            }
        }
        public void excluir() {

            this.Ativo = false;
        }
    }