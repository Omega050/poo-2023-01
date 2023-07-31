package com.github.omega050.t19.Revisao;

import java.util.ArrayList;

public class Software {
    private String nome;
    private ArrayList<Versao> versoes;

    public Software(String nome) {
        this.nome = nome;
        this.versoes = new ArrayList<>();
    }

    public void adicionarVersao(Versao versao) {
        versoes.add(versao);
    }

    public ArrayList<Versao> getVersoes() {
        return versoes;
    }
    
    public String getNome() {
        return nome;
    }
}