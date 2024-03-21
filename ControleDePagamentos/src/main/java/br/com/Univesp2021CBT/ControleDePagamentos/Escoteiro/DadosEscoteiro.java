package br.com.Univesp2021CBT.ControleDePagamentos.Escoteiro;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record DadosEscoteiro(

        @NotNull
        String nome,
        @NotNull
        Date nascimento,
        @NotNull
        Date filiacao,
        @NotNull
        String ramo,
        String email

) {
}
