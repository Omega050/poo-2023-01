package com.github.omega050.t21;

import java.util.List;

class Pedido {
    private Cliente cliente;
    private Garcom atendente;
    private List<Prato> pratos;

    public Pedido(Cliente cliente, Garcom atendente, List<Prato> pratos) {
        this.cliente = cliente;
        this.atendente = atendente;
        this.pratos = pratos;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Garcom getAtendente() {
        return this.atendente;
    }

    public void setAtendente(Garcom atendente) {
        this.atendente = atendente;
    }

    public List<Prato> getPratos() {
        return this.pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }
 
}
