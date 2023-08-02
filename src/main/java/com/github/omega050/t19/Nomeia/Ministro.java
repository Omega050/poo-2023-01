package com.github.omega050.t19.Nomeia;

import com.github.omega050.t19.Diretor.Pessoa;

public class Ministro {
    private Pessoa dadosMinistro;
    private Pessoa acessorNomeado;

    public Ministro(Pessoa p){
        this.dadosMinistro=p;
    }

    public void nomearAcessor(Pessoa m){
        this.acessorNomeado=m;
    }

    public Pessoa getMinistroNomeado() {
        return acessorNomeado;
    }

    public Pessoa getPresidente() {
        return dadosMinistro;
    }
}
