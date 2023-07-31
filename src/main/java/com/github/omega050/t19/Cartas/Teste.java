package com.github.omega050.t19.Cartas;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("João");
        Jogador jogador2 = new Jogador("Maria");

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador1);
        jogadores.add(jogador2);

        Rodada rodada = new Rodada(jogadores);

        rodada.jogar();
        rodada.exibirEstadoAtual();
    }
}
