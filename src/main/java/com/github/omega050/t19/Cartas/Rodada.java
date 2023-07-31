package com.github.omega050.t19.Cartas;

import java.util.List;

public class Rodada {
    private List<Jogador> jogadores;
    private Monte monte;

    public Rodada(List<Jogador> jogadores) {
        this.jogadores = jogadores;
        this.monte = new Monte();
    }

    public void jogar() {
        for (Jogador jogador : jogadores) {
            Carta cartaComprada = monte.comprarCarta();
            System.out.println(jogador.getNome() + " comprou a carta: " + cartaComprada);
            Carta cartaDescartada = jogador.descartarCarta();
            System.out.println(jogador.getNome() + " descartou a carta: " + cartaDescartada);
            monte.adicionarCarta(cartaDescartada);
        }
    }

    public void exibirEstadoAtual() {
        System.out.println("Estado atual do monte:");
        monte.exibirCartas();

        System.out.println("\nEstado atual das mãos dos jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome() + ": " + jogador.getMao());
        }
    }
}