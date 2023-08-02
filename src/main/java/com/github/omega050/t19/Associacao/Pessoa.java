package com.github.omega050.t19.Associacao;

public class Pessoa {
    private String nome;
    private int idade;
    private String genero;

    public Pessoa(String n, int i, String g) {
        this.nome = n;
        this.idade = i;
        this.genero = g;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }
}
