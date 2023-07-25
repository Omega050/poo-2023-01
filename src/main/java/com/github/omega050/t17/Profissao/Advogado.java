package com.github.omega050.t17.Profissao;

public class Advogado extends Profissao {
    private String areaEspecializacao;

    public Advogado(String nome, String descricao, String areaEspecializacao) {
        super(nome, descricao);
        this.areaEspecializacao = areaEspecializacao;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }
}
