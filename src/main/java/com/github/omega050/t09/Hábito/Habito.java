package com.github.omega050.t09.Hábito;
public class Habito {
    private String nomeH;
    public String descrição;

    public Habito(String nome, String d){
        this.nomeH = nome;
        this.descrição = d;
    }

    public String getDescrição() {
        return descrição;
    }
    
    public String getNomeH() {
        return nomeH;
    }
}
