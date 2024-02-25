package br.com.Univesp2021CBT.ControleDePagamentos.Escoteiro;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "escoteiros")
@Entity(name = "escoteiro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Escoteiro {


    long Id;
    String nome;
    Enum ramo;
}
