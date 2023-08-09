package com.github.omega050.t21;

public class Prato {
    private String nomeProduto;
    private double valorPrato;
    private String dia;

    public Prato(String n, double e, String d) {
        this.nomeProduto = n;
        this.valorPrato = e;
        this.dia = d;
    }

    public String getDia() {
        return dia;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorPrato() {
        return valorPrato;
    }

    public void setValorPrato(float valorPrato) {
        this.valorPrato = valorPrato;
    }
}
