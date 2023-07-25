package com.github.omega050.t09.Circulo;

public class Circulo {
    public double x;
    public double y;
    public double raio;

    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void transladar(double deslocX, double deslocY) {
        this.x += deslocX;
        this.y += deslocY;
    }
}
