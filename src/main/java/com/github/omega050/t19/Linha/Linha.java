package com.github.omega050.t19.Linha;

public class Linha {
    private Ponto p1;
    private Ponto p2;

    public Linha(double x1, double y1, double x2, double y2) {
        p1 = new Ponto(x1, y1);
        p2 = new Ponto(x2, y2);
    }

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }
}