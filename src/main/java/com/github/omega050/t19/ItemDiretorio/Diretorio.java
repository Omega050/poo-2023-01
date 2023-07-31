package com.github.omega050.t19.ItemDiretorio;

import java.util.ArrayList;

public class Diretorio {
    private String nome;
    private ArrayList<Item> itens;

    public Diretorio(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void listarItens() {
        System.out.println("Itens do diretório " + nome + ":");
        for (Item item : itens) {
            System.out.println(item.getDetalhes());
        }
    }
}
