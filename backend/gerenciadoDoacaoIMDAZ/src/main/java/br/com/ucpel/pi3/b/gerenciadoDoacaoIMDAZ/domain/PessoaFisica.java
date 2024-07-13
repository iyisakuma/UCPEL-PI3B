package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class PessoaFisica extends Pessoa{
    private String cpf;
    private LocalDate dtNascimento;
}
