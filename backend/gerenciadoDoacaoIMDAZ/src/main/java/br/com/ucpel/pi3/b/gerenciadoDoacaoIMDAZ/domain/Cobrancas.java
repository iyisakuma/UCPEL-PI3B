package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain;

import java.util.Date;

public class Cobrancas {
    private Long id;
    private Date vencimento;
    private Date parcela;

    public Date getParcela() {
        return parcela;
    }

    public void setParcela(Date parcela) {
        this.parcela = parcela;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }
}
