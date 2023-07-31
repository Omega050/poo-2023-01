package com.github.omega050.t19.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Mesa> mesasFrequentadas;

    public Pessoa(String nome) {
        this.nome = nome;
        this.mesasFrequentadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Mesa> getMesasFrequentadas() {
        return mesasFrequentadas;
    }

    public void adicionarMesa(Mesa mesa) {
        mesasFrequentadas.add(mesa);
    }

    public void removerMesa(Mesa mesa) {
        mesasFrequentadas.remove(mesa);
    }
}
