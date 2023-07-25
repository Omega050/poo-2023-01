package com.github.omega050.t09.CaixeiroViajante;

import java.util.ArrayList;
import java.util.List;

public class Armazem {
    private List<Pedido> listaPedidos;

    public Armazem(Pedido p){
        this.listaPedidos = new ArrayList<>();
        listaPedidos.add(p);
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }
    
    public void addPedido(Pedido p){
        this.listaPedidos.add(p);
    }
}
