package com.github.omega050.t17.Avaliacao;
import java.sql.Date;

public class Avaliacao {
    private String nome;
    private String finalidade;
    private Date data;

    public Avaliacao(String nome, String finalidade, Date data) {
        this.nome = nome;
        this.finalidade = finalidade;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public Date getData() {
        return data;
    }
}