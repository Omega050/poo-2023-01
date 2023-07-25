package com.github.omega050.t13;

import java.util.ArrayList;
import java.util.List;

public class Medicamento {
    private String nome;
    private String principioAtivo;
    private String descricao;
    private int quantidade;
    private List<Medicamento> similares;

    public Medicamento(String nome, String principioAtivo, String descricao, int quantidade) {
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.similares = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void addEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public List<Medicamento> getSimilares() {
        return similares;
    }

    public void addSimilares(Medicamento medicamento) {
        similares.add(medicamento);
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nome='" + nome + '\'' +
                ", principioAtivo='" + principioAtivo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
