package com.github.omega050.t21;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    public List<Prato> pratos;

    public Cardapio(){
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato p){
        this.pratos.add(p);
    }

    public List<Prato> getPratos() {
        return pratos;
    }
}
