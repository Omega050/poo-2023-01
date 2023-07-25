package com.github.omega050.t18;
public class Peça {
    private String nome;

    public Peça(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return nome;
    }
}