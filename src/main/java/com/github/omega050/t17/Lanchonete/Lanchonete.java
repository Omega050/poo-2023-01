package com.github.omega050.t17.Lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
    private List<Sanduiche> sanduiches;
    private List<Bebida> bebidas;

    public Lanchonete() {
        sanduiches = new ArrayList<>();
        bebidas = new ArrayList<>();
    }

    public void adicionarSanduiche(Sanduiche sanduiche) {
        sanduiches.add(sanduiche);
    }

    public void adicionarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public List<Sanduiche> getSanduiches() {
        return sanduiches;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }
}