package modelos;

import java.text.DecimalFormat;

public class Carne {
    private Long id;
    private DecimalFormat valor;
    private int diaVencimento;

    public DecimalFormat getValor() {
        return valor;
    }

    public void setValor(DecimalFormat valor) {
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
