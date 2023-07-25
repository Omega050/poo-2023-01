package com.github.omega050.t17.Empregado;

public class Empregado {
    private String nome;
    private double salario;
    private Empregado gerente;

    public Empregado(String n, double s, Empregado g) {
        this.nome = n;
        this.salario = s;
        this.gerente = g;
    }

    public Empregado getGerente() {
        return gerente;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGerente(Empregado gerente) {
        this.gerente = gerente;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
