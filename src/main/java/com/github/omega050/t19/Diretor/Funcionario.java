package com.github.omega050.t19.Diretor;

class Funcionario extends Pessoa {
    private Cargo cargo;

    public Funcionario(String nome, int idade, Cargo cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}