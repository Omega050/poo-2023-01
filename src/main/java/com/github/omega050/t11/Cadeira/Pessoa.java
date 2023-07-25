package com.github.omega050.t11.Cadeira;
import java.util.List;

public class Pessoa {
    public String nome;
    public boolean genero;
    public List<Cadeira> cadeiras;
    public Pessoa(String nome, boolean genero){
        this.nome = nome;
        this.genero = genero;
    }
    public boolean isGenero(){
        return genero;
    }
    public String getNome(){
        return nome;
    }
    public List<Cadeira> getcadeiras() {
        return cadeiras;
    }

    public void adicionarBicicleta(Cadeira c) {
        cadeiras.add(c);
    }
}
