package com.github.omega050.t19.Cartas;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private List<Carta> mao;
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    public Carta descartarCarta() {
        // Exemplo: descartando a última carta da mão do jogador
        if (!mao.isEmpty()) {
            return mao.remove(mao.size() - 1);
        }
        return null;
    }

    public void receberCarta(Carta carta) {
        mao.add(carta);
    }

    public List<Carta> getMao() {
        return mao;
    }

    public String getNome() {
        return nome;
    }
}
