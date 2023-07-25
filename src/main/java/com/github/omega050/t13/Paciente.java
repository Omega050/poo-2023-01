package com.github.omega050.t13;

public class Paciente{
    public String nome;
    private int CPF;
    public Prontuario prontuario;
    protected DadosPagamento dadosPagamento;

    public Paciente(String n, int cpf){
        this.nome = n;
        this.CPF = cpf;
    }

    public int getCPF() {
        return CPF;
    }

    public DadosPagamento getDadosPagamento() {
        return dadosPagamento;
    }

    public String getNome() {
        return nome;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void realizarPagamento(){

    }
    
    public void acessaProntuario(){
        
    }
}