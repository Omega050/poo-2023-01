package com.github.omega050.t17.Aviao;

public class Pessoa {
    private String nome;
    private long cpf;
    private int idade;

    public Pessoa(String n, long c, int i) {
        this.nome = n;
        this.cpf = c;
        this.idade = i;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
