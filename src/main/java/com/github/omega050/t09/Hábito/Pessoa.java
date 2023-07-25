package com.github.omega050.t09.Hábito;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private List<Habito> habitos;
    public String nome;
    public int idade;
    public String genero;

    public Pessoa(Habito h, String n, int i, String g) {
        this.habitos = new ArrayList<>();
        habitos.add(h);
        this.nome = n;
        this.idade = i;
        this.genero = g;
    }

    public String getGenero() {
        return genero;
    }

    public List<Habito> getHabitos() {
        return habitos;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void addHabito(Habito h) {
        this.habitos.add(h);
    }
}
