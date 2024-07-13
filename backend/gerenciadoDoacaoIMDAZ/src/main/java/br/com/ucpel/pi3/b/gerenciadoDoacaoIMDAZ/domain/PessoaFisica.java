package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PessoaFisica extends Pessoa{
    private String cpf;
    private LocalDate dtNascimento;
}
