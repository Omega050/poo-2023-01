package com.github.omega050.t07;

public class Main {
    public static void main(String[] args) {
        Prova pf = new Prova(12);
        System.out.println(pf.get_nQuest());
        Casa c = new Casa(71);
        System.out.println(c.getNum());
        System.out.println(SomaNaturais.somarNaturais(10));
        Permuta.permutação(new String(), args[0]);
    }
}
