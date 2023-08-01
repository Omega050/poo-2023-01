package com.github.omega050.t19.Pixel;

import java.awt.Color;

public class Pixel {
    private Ponto ponto;
    private Color cor;


    public Pixel(Ponto p, Color cor) {
        this.ponto=p;
        this.cor = cor;
    }

    public Ponto getPonto() {
        return ponto;
    }
 
    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
}
