package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain;

import lombok.Data;

import java.util.Date;

@Data
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private Date dtFundacao;


}
