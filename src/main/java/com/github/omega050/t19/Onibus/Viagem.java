package com.github.omega050.t19.Onibus;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private Onibus onibus;
    private List<Passageiro> passageiros;
    private int valPassagem;
    private String motorista;
    private Cidade origem;
    private Cidade destino;

    public Viagem(Onibus o, int valPassagem, Cidade a, Cidade b){
        this.onibus=o;
        this.valPassagem=valPassagem;
        this.passageiros=new ArrayList<>(0);
        this.origem=a;
        this.destino=b;
    }

    public Onibus getOnibus() {
        return onibus;
    }
    
    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public int getValPassagem() {
        return valPassagem;
    }

    public void setValPassagem(int valPassagem) {
        this.valPassagem = valPassagem;
    }

    public void addPassageiro(Passageiro p){
        this.passageiros.add(p);
    }
    
    public Cidade getDestino() {
        return destino;
    }

    public String getMotorista() {
        return motorista;
    }
    
    public Cidade getOrigem() {
        return origem;
    }
}
