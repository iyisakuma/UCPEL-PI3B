package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private Date dtFundacao;


}
