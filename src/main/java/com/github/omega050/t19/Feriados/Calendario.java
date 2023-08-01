package com.github.omega050.t19.Feriados;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Evento> eventos;
    private int ano;

    public Calendario(int a){
        this.ano=a;
        this.eventos=new ArrayList<>();
    }

    public int getAno() {
        return ano;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void addEvento(Evento e){
        this.eventos.add(e);
    }
}
