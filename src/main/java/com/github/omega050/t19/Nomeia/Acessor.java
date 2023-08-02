package com.github.omega050.t19.Nomeia;

import com.github.omega050.t19.Diretor.Pessoa;

public class Acessor {
    private Pessoa dadosAcessor;

    public Acessor(Pessoa p){
        this.dadosAcessor=p;
    }
    
    public Pessoa getPresidente() {
        return dadosAcessor;
    }
}
