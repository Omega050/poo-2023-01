package com.github.omega050.t08.Janela;

import java.util.ArrayList;
import java.util.List;

public class Janela {

    public List<Interacao> elementos;
    public List<Botao> botoes;
    public Menu menu;
    public Barra barraRol;

    public Janela() {
        this.elementos = new ArrayList<>();
        this.botoes = new ArrayList<>();
    }

    public List<Botao> getBotoes() {
        return botoes;
    }

    public void adicionarElemento(Interacao elemento) {
        elementos.add(elemento);
    }

    public void removerElemento(Interacao elemento) {
        elementos.remove(elemento);
    }

    public void destruirJanela() {
    }
}
