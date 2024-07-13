package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Entity
public class PessoaFisica extends Pessoa{
    private String cpf;
    private LocalDate dtNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}
