package com.github.omega050.t17.Profissao;

class Profissao {
    private String nome;
    private String descricao;

    public Profissao(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
