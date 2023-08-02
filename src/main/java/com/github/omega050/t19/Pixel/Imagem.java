package com.github.omega050.t19.Pixel;

import java.awt.Color;

public class Imagem {
    private int largura;
    private int altura;
    private Pixel[][] pixels;

    public Imagem(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        this.pixels = new Pixel[largura][altura];
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public Pixel getPixel(int x, int y) {
        return pixels[x][y];
    }

    public void setPixel(Ponto p, Color cor) {
        if (p.getPosX() >= 0 && p.getPosX() < largura && p.getPosY() >= 0 && p.getPosY() < altura) {
            pixels[p.getPosX()][p.getPosY()] = new Pixel(p, cor);
        } else {
            throw new IllegalArgumentException("Coordenadas fora dos limites da imagem.");
        }
    }
}
