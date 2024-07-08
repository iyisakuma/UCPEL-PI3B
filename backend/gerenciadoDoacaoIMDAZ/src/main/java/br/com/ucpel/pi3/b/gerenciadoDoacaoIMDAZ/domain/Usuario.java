package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain;

public class Usuario {
    private Long id;
    private String senha;
    private Boolean ativo;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
