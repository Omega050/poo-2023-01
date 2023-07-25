package com.github.omega050.t10;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
      // Criação de objetos Bicicleta
        Bicicleta bicicleta1 = new Bicicleta("Marca A", "Usada", 500.0, 26, "Alumínio");
        Bicicleta bicicleta2 = new Bicicleta("Marca B", "Nova", 1000.0, 29, "Carbono");

        // Criação de objeto Ciclista
        Ciclista ciclista = new Ciclista("João", true, bicicleta1);
        ciclista.setIdade(30);

        // Adição de mais bicicletas ao ciclista
        ciclista.adicionarBicicleta(bicicleta2);

        // Impressão dos dados do ciclista
        System.out.println("Dados do Ciclista:");
        System.out.println("Nome: " + ciclista.getNome());
        System.out.println("Gênero: " + (ciclista.isGenero() ? "Masculino" : "Feminino"));
        System.out.println("Idade: " + ciclista.getIdade());

        // Impressão das bicicletas do ciclista
        System.out.println("\nBicicletas do Ciclista:");
        List<Bicicleta> bicicletas = ciclista.getBicicletas();
        for (Bicicleta bicicleta : bicicletas) {
            System.out.println("Marca: " + bicicleta.getMarca());
            System.out.println("Condição: " + bicicleta.getCondicao());
            System.out.println("Valor: " + bicicleta.getValor());
            System.out.println("Tamanho do Aro: " + bicicleta.getTamAro());
            System.out.println("Material: " + bicicleta.getMaterial());
            System.out.println(); 
    }
}
}
