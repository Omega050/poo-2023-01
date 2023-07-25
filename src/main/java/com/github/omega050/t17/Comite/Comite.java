package com.github.omega050.t17.Comite;

import java.util.ArrayList;
import java.util.List;

import com.github.omega050.t07.Pessoa;

public class Comite {
    public List<Pessoa> membros;
    public Pessoa presidente;

    public Comite(Pessoa p) {
        this.membros = new ArrayList<>();
        this.presidente = p;
    }

    public Pessoa getPresidente() {
        return presidente;
    }

    public List<Pessoa> getMembros() {
        return membros;
    }
}
