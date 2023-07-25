package com.github.omega050.t13;

public class Medico extends Funcionario {
    public String atuaEm;
    private int CRM;

    public Medico(String n, int crm, String a, double sal, int i) {
        super(n, i, sal);
        this.atuaEm = a;
        this.CRM = crm;
        this.função = "Medico";
    }

    public String getAtuaEm() {
        return atuaEm;
    }

    public int getCRM() {
        return CRM;
    }

    public void setAtuaEm(String atuaEm) {
        this.atuaEm = atuaEm;
    }
}