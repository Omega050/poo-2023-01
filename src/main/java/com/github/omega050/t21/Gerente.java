package com.github.omega050.t21;

class Gerente {
    private String nome;


    public Gerente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public void emitirNota(Pedido pedido) {
        // lógica para emitir a nota
    }
}