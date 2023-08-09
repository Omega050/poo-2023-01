package com.github.omega050.t21;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        // Criando objetos de ChefeCozinha, Cozinha e Cardápio
        ChefeCozinha chefe = new ChefeCozinha("Chef John");
        Cozinha cozinha = new Cozinha(chefe);
        Cardapio cardapio = new Cardapio();

        // Criando pratos para adicionar ao cardápio
        Prato prato1 = new Prato("Lasanha", 15.99, "Sexta-Feira");
        Prato prato2 = new Prato("Salmão Grelhado", 18.75, "Quarta-Feira");
        cardapio.adicionarPrato(prato1);
        cardapio.adicionarPrato(prato2);

        // Criando garçons e mesas
        Garcom garcom1 = new Garcom("Garçom Alice");
        Garcom garcom2 = new Garcom("Garçom Bob");
        Mesa mesa1 = new Mesa(1, garcom1);
        Mesa mesa2 = new Mesa(2, garcom2);

        // Criando cliente
        Cliente cliente1 = new Cliente("Cliente Carol");

        // Criando pedido com pratos
        List<Prato> pratosPedido = new ArrayList<>();
        pratosPedido.add(prato1);
        Pedido pedido1 = new Pedido(cliente1, garcom1, pratosPedido);

        // Criando bebidas para o garçom
        List<Bebida> bebidas = new ArrayList<>();
        Bebida bebida1 = new Bebida("Coca-Cola", 5);
        Bebida bebida2 = new Bebida("Água", 2);
        bebidas.add(bebida1);
        bebidas.add(bebida2);
        BebidasGarcom bebidasGarcom = new BebidasGarcom(bebidas);

        // Emitindo pedido
        Pedido pedido2 = new Pedido(cliente1, garcom2, pratosPedido);

        // Criando um chefe de cozinha e associando-o à cozinha
        ChefeCozinha chefeCozinha = new ChefeCozinha("Chef Maria");
        Cozinha cozinha2 = new Cozinha(chefeCozinha);

        // Criando um gerente
        Gerente gerente = new Gerente("Gerente Paulo");

        gerente.emitirNota(pedido1);
    }
}
