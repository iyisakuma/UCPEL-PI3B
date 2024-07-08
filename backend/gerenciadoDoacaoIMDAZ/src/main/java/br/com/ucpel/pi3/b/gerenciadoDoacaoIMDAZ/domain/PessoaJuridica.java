package modelos;

import java.util.Date;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private Date dtFundacao;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDtFundacao() {
        return dtFundacao;
    }

    public void setDtFundacao(Date dtFundacao) {
        this.dtFundacao = dtFundacao;
    }
}
