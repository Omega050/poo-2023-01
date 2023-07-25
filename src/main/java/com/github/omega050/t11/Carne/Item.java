package com.github.omega050.t11.Carne;

public class Item {
    private String nome;
    private double valor;
    private double valorAc;
    private int qtde;

    public Item(String nome, double valor, int qtde) {
        this.nome = nome;
        this.valor = valor;
        this.qtde = qtde;
        this.valorAc = qtde * valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQtde() {
        return qtde;
    }

    public double getValor() {
        return valor;
    }

    public double getValorAc() {
        return valorAc;
    }
}