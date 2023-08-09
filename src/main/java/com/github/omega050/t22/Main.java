package com.github.omega050.t22;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {

        DiretorParque diretor = new DiretorParque("Diretor João", 42, "Masculino");
        Parque parque = new Parque(diretor);

        Colaborador colaborador1 = new Colaborador("Colaborador Ana", 25, "Feminino");
        Colaborador colaborador2 = new Colaborador("Colaborador Pedro", 28, "Masculino");

        Brinquedo brinquedo1 = new Brinquedo(true, new ArrayList<>());
        Brinquedo brinquedo2 = new Brinquedo(false, new ArrayList<>());

        PostoPolicia postoPolicia1 = new PostoPolicia(colaborador1, colaborador2);

        Bilhete bilhete1 = new Bilhete(true, brinquedo1, colaborador1, "2023-08-10 10:00");
        Bilhete bilhete2 = new Bilhete(false, brinquedo2, colaborador2, "2023-08-10 11:30");

        parque.adicionarColaborador(colaborador1);
        parque.adicionarColaborador(colaborador2);
        parque.adicionarBrinquedo(brinquedo1);
        parque.adicionarBrinquedo(brinquedo2);
        parque.adicionarPostoPolicia(postoPolicia1);
        parque.venderBilhete(bilhete1);
        parque.venderBilhete(bilhete2);
}
    
}
