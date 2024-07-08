package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain;


import java.math.BigDecimal;

public class Carne {
    private Long id;
    private BigDecimal valor;
    private int diaVencimento;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    private boolean ativo;

    public void gerarCobranca() {
        System.out.println(this.valor);
        System.out.println(this.diaVencimento);
    }
}
