package com.github.omega050.t13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receita{
    private List<Medicamento> receitaMedica;
    private Medico medicoResponsvel;
    private Date validade;
    private String uso;

    public Receita(Medicamento med, Medico m, Date val, String u){
        this.receitaMedica = new ArrayList<>();
        receitaMedica.add(med);
        this.medicoResponsvel = m;
        this.validade = val;
        this.uso = u;
    }
    public Medico getMedicoResponsvel() {
        return medicoResponsvel;
    }
    public List<Medicamento> getReceitaMedica() {
        return receitaMedica;
    }
    public Date getValidade() {
        return validade;
    }
    public String getUso() {
        return uso;
    }
    public void addMed(Medicamento m){
        receitaMedica.add(m);
    }
}

