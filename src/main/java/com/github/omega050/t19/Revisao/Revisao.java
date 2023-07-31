package com.github.omega050.t19.Revisao;

class Revisao extends Versao {
    private String descricao;

    public Revisao(String numero, String descricao) {
        super(numero);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}