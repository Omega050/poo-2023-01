package com.github.omega050.t19.Revisao;

import java.util.ArrayList;

public class Versao {
    private String numero;
    private Revisao anterior;
    private ArrayList<Revisao> proximas;

    public Versao(String numero) {
        this.numero = numero;
        this.proximas = new ArrayList<>();
    }

    public void setAnterior(Revisao anterior) {
        this.anterior = anterior;
    }

    public void adicionarProxima(Revisao proxima) {
        proximas.add(proxima);
    }

    public ArrayList<Revisao> getProximas() {
        return proximas;
    }

    public String getNumero() {
        return numero;
    }

    public Revisao getAnterior() {
        return anterior;
    }
}
