package com.github.omega050.t07;

import java.util.ArrayList;

public class Uniao {
    public ArrayList<Pessoa> filhos;
    public Pessoa parceiros[];

    public void novoFilho(Pessoa p){
        filhos.add(p);
    }   
    public Uniao(Pessoa a, Pessoa b){
        parceiros[0] = a;
        parceiros[1] = b;   
    }
}
