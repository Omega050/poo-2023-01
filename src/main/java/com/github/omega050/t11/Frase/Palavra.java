package com.github.omega050.t11.Frase;

import java.util.ArrayList;
import java.util.List;

public class Palavra {
    public List<Letra> letras;

    public Palavra() {
        this.letras = new ArrayList<>(null);
    }

    public void addLetra(Letra l) {
        letras.add(l);
    }

    public List<Letra> getLetras() {
        return letras;
    }
}
