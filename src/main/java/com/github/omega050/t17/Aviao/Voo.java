package com.github.omega050.t17.Aviao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voo {
    private Aviao aviao;
    private List<Pessoa> passageiros;
    private Pessoa piloto;
    private List<Pessoa> tripulacao;
    private String assento;
    private Date horarioSaida;
    private String tipoVoo;

    public Voo(Aviao a, Pessoa p, Date d, String t) {
        this.aviao = a;
        this.piloto = p;
        this.passageiros = new ArrayList<>();
        this.tripulacao = new ArrayList<>();
        this.horarioSaida = d;
        this.tipoVoo = t;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public Pessoa getPiloto() {
        return piloto;
    }

    public Date getHorarioSaida() {
        return horarioSaida;
    }

    public String getTipoVoo() {
        return tipoVoo;
    }

    public void setPiloto(Pessoa piloto) {
        this.piloto = piloto;
    }

    public void addPassageiro(Pessoa p, String a) {
        this.assento = a;
        this.passageiros.add(p);
    }

    public void addTripulacao(Pessoa p) {
        this.tripulacao.add(p);
    }

    public String getAssento() {
        return assento;
    }
}
