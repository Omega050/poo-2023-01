package com.github.omega050.t19.Feriados;

import java.util.Date;

public class Evento {
    private Date dia;
    private String descricao;

    public Evento(Date d, String desc){
        this.dia=d;
        this.descricao=desc;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public Date getDia() {
        return dia;
    }
}
