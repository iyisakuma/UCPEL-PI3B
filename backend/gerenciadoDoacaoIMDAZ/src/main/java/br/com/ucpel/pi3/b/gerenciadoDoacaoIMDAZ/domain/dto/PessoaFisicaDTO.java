package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto;

import java.time.LocalDate;

public record PessoaFisicaDTO(String nome, String senha, String telefone, String email, String cpf, LocalDate dtNascimento) {
}
