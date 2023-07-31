package com.github.omega050.t19.ItemDiretorio;

public class Item {
    private String nome;
    private String tamanho;

    public Item(String nome, String tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getDetalhes() {
        return "Nome: " + nome + ", Tamanho: " + tamanho;
    }
}
