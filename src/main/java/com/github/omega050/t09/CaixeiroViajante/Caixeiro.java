package com.github.omega050.t09.CaixeiroViajante;


import java.util.ArrayList;
import java.util.List;

public class Caixeiro {
    private List<Cidade> cidadesViagem;
    private String nome;
    private List<Pedido> listaPedidos;

    public Caixeiro(Cidade c, String n, Pedido p) {
        this.nome = n;
        this.cidadesViagem = new ArrayList<>();
        this.listaPedidos = new ArrayList<>();

        adicionarCidade(c);
        adicionarPedido(p);
    }
    public String getNome() {
        return nome;
    }
    
    public void adicionarCidade(Cidade cidade) {
        cidadesViagem.add(cidade);
    }

    public void adicionarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    public List<Cidade> getCidadesViagem() {
        return cidadesViagem;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }
}