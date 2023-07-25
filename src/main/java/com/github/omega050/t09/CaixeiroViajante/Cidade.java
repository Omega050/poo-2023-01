package com.github.omega050.t09.CaixeiroViajante;


import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private List<Armazem> listaArmazems;

    public Cidade(Armazem a){
        this.listaArmazems = new ArrayList<>();
        listaArmazems.add(a);
    }

    public List<Armazem> getListaArmazems() {
        return listaArmazems;
    }
    
    public void addArmazem(Armazem a){
        this.listaArmazems.add(a);
    }
}
