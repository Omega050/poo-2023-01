package com.github.omega050.t11.Armario;

import java.util.List;
import java.util.ArrayList;

public class Prateleira {
    public List<Compartimento> listaCompartimentos;

    public Prateleira(Compartimento c) {
        this.listaCompartimentos = new ArrayList<>(null);
        this.listaCompartimentos.add(c);
    }

    public List<Compartimento> getCompartimentos() {
        return listaCompartimentos;
    }

    public void adicionarPrateleira(Compartimento c) {
        listaCompartimentos.add(c);
    }
}
