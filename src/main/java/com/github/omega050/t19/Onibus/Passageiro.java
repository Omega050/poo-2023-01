package com.github.omega050.t19.Onibus;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    private String nome;
    private List<Viagem> viagens;

    public Passageiro(String n, Viagem v){
        this.nome=n;
        this.viagens=new ArrayList<>(null);
        this.viagens.add(v);
    }

    public String getNome() {
        return nome;
    }
    
    public List<Viagem> getViagens() {
        return viagens;
    }

    public void addViagem(Viagem v){
        this.viagens.add(v);
    }
}
