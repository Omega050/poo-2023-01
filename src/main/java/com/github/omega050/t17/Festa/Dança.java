package com.github.omega050.t17.Festa;

public class Dança {
    Música musica;
    Homem homem;
    Mulher mulher;

    public Dança(Música s, Homem h, Mulher m){
        this.musica = s;
        this.homem = h;
        this.mulher = m;
    }
    public Homem getHomem() {
        return homem;
    }
    public Mulher getMulher() {
        return mulher;
    }
    public Música getMusica() {
        return musica;
    }
}
