package com.github.omega050.t19.Onibus;

public class Cidade {
    private String nome;
    private int cep;

    public Cidade(String n, int cep) {
        this.nome = n;
        this.cep = cep;
    }

    public int getCep() {
        return cep;
    }

    public String getNome() {
        return nome;
    }
}
