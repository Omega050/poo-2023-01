package com.github.omega050.t19.Nomeia;

import com.github.omega050.t19.Diretor.Pessoa;

public class Presidente {
    private Pessoa dadosPresidente;
    private Pessoa ministroNomeado;

    public Presidente(Pessoa p){
        this.dadosPresidente=p;
    }

    public void nomearMinistro(Pessoa m){
        this.ministroNomeado=m;
    }

    public Pessoa getMinistroNomeado() {
        return ministroNomeado;
    }

    public Pessoa getPresidente() {
        return dadosPresidente;
    }
}
