package com.github.omega050.t18;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro;
    private List<Prova> lances;

    public Partida(Jogador jogador1, Jogador jogador2, Tabuleiro tabuleiro) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = tabuleiro;
        lances = new ArrayList<>();
    }

    public void registrarLance(Jogador jogador, Peça peça, int linha, int coluna) {
        Prova prova = new Prova(peça, linha, coluna);
        lances.add(prova);
        tabuleiro.posicionarPeça(peça, linha, coluna);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Partida Imortal\n");
        sb.append("Jogador 1: ").append(jogador1.getNome()).append("\n");
        sb.append("Jogador 2: ").append(jogador2.getNome()).append("\n\n");
        sb.append("Lances:\n");
        for (int i = 0; i < lances.size(); i++) {
            Prova prova = lances.get(i);
            sb.append(i + 1).append(". ").append(prova.getPeça()).append(" em ").append(prova.getPosicaoNotacao())
                    .append("\n");
        }
        return sb.toString();
    }
}
