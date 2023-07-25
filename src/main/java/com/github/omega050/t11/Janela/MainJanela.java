package com.github.omega050.t11.Janela;

public class MainJanela {
    public static void main(String[] args) {
        Janela j1 = new Janela(true, 20, 20);
        System.out.println("Estado: " + (j1.hasGlass() ? "Inteira " : "Quebrada"));
        System.out.println("Area Total: " + (j1.getArea()));
        System.out.println("Area com vidro: " + (j1.getAreaV()));
    }
}
