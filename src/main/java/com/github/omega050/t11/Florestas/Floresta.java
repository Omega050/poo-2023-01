package com.github.omega050.t11.Florestas;

import java.util.ArrayList;
import java.util.List;

public class Floresta {
    public List<Árvore> arvores;
    public String tipoFloresta;

    public Floresta(Árvore a, String t) {
        this.tipoFloresta = t;
        this.arvores = new ArrayList<>(null);
        arvores.add(a);
    }

    public String getTipoFloresta() {
        return tipoFloresta;
    }
}
