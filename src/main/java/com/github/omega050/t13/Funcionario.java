package com.github.omega050.t13;

public class Funcionario {
    public String nome;
    protected int id;
    protected double salario;
    public String função;

    public Funcionario(String n, int i, double sal) {
        this.nome = n;
        this.id = i;
        this.salario = sal;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public String getFunção() {
        return função;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setFunção(String função) {
        this.função = função;
    }
}