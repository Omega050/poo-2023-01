package com.github.omega050.t19.Computador;

public class Estudante {
    private String nome;
    private Computador computador;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }
}

