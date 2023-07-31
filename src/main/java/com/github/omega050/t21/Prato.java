package com.github.omega050.t21;

public class Prato {
    private String nomeProduto;
    private float valorPrato;
    private String dia;

    public Prato(String n, float v, String d){
        this.nomeProduto = n;
        this.valorPrato = v;
        this.dia = d;
    }

    public String getDia() {
        return dia;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    
    public float getValorPrato() {
        return valorPrato;
    }

    public void setValorPrato(float valorPrato) {
        this.valorPrato = valorPrato;
    }
}
