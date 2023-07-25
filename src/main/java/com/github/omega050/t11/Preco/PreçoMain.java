package com.github.omega050.t11.Preco;

public class PreçoMain {
    public static void main(String[] args) {
        Preço preço = new Preço("Dolar", 200);
        System.out.println("Valor : "+preço.getValor());
        System.out.println("Moeda : "+preço.getMoeda());
    }
}
