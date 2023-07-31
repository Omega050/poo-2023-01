package com.github.omega050.t19.Cartas;

import java.util.Stack;

public class Monte {
    private Stack<Carta> cartas;

    public Monte() {
        this.cartas = new Stack<>();
        // Adicionar cartas ao monte (exemplo com 3 cartas)
        cartas.push(new Carta("Copas", 2));
        cartas.push(new Carta("Paus", 7));
        cartas.push(new Carta("Ouros", 10));
    }

    public Carta comprarCarta() {
        return cartas.pop();
    }

    public void adicionarCarta(Carta carta) {
        cartas.push(carta);
    }

    public void exibirCartas() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}






