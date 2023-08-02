package com.github.omega050.t19.Onibus;

import java.util.ArrayList;
import java.util.List;

public class Onibus {
    private int id;
    private List<Viagem> viagens;

    public Onibus(int id) {
        this.id = id;
        this.viagens = new ArrayList<>(null);
    }

    public void addViagem(Viagem p) {
        this.viagens.add(p);
    }

    public int getId() {
        return id;
    }

    public List<Viagem> getViagem() {
        return viagens;
    }
}
