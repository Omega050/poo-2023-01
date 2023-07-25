package com.github.omega050.t11.Carne;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carne {
    private List<Prestacao> prestacoes;
    private Compra compra;

    public Carne(Compra compra) {
        this.prestacoes = new ArrayList<>();
        this.compra = compra;
    }

    public void adicionarPrestacao(Prestacao prestacao) {
        prestacoes.add(prestacao);
    }

    public void removerPrestacao(Prestacao prestacao) {
        prestacoes.remove(prestacao);
    }

    public double calcularValorTotalPrestacoes() {
        double valorTotal = 0;
        for (Prestacao prestacao : prestacoes) {
            valorTotal += prestacao.getValor();
        }
        return valorTotal;
    }

    public Date obterDataLimiteQuitacao() {
        if (prestacoes.isEmpty()) {
            return null;
        }
        prestacoes.sort((p1, p2) -> p2.getData().compareTo(p1.getData()));
        return prestacoes.get(0).getData();
    }
    public Compra getCompra() {
        return compra;
    }
    public List<Prestacao> getPrestacoes() {
        return prestacoes;
    }
    
}
