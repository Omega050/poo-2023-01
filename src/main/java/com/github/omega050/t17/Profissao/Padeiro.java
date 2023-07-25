package com.github.omega050.t17.Profissao;

public class Padeiro extends Profissao {
    private String tipoPao;

    public Padeiro(String nome, String descricao, String tipoPao) {
        super(nome, descricao);
        this.tipoPao = tipoPao;
    }

    public String getTipoPao() {
        return tipoPao;
    }
}