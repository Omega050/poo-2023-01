package com.github.omega050.t19.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numero;
    private List<Pessoa> ocupantes;

    public Mesa(int numero) {
        this.numero = numero;
        this.ocupantes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public List<Pessoa> getOcupantes() {
        return ocupantes;
    }

    public void adicionarOcupante(Pessoa pessoa) {
        ocupantes.add(pessoa);
        pessoa.adicionarMesa(this);
    }

    public void removerOcupante(Pessoa pessoa) {
        ocupantes.remove(pessoa);
        pessoa.removerMesa(this);
    }
}
