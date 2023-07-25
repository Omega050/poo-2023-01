package com.github.omega050.t09.Usuario;

//apesar de saber que pode não ser ideal, utilizei herança para tentar entender melhor o funcionamento da mesma.
public class Usuario extends Pessoa {
    private String email;

    public Usuario(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}