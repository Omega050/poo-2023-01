package com.github.omega050.t19.Agencia;

public class Cliente {
    String nome;
    private int prioridade;

    public Cliente(String n, int p) {
        this.nome = n;
        this.prioridade = p;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }
}
