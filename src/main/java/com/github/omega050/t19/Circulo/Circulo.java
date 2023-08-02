package com.github.omega050.t19.Circulo;

public class Circulo {
    public double raio;
    public double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return 3.14 * raio * raio;
    }
}
