package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto;

import java.math.BigDecimal;

public record DadosCobrancasDTO(long pessoaId, int diaVencimento, BigDecimal valor) {
}
