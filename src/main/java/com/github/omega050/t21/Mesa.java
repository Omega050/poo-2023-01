package com.github.omega050.t21;

class Mesa {
    private int numero;
    private Garcom garcomResponsavel;
    
    public Mesa(int numero, Garcom garcomResponsavel) {
        this.numero = numero;
        this.garcomResponsavel = garcomResponsavel;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Garcom getGarcomResponsavel() {
        return this.garcomResponsavel;
    }

    public void setGarcomResponsavel(Garcom garcomResponsavel) {
        this.garcomResponsavel = garcomResponsavel;
    }
}