package com.github.omega050.t19.Agencia;

import java.util.PriorityQueue;

public class Fila {
    private PriorityQueue<Cliente> clientes;

    public Fila(){
        this.clientes = new PriorityQueue<>(1, new Comparador());
    }

    public Object[] getClientes() {
        return clientes.toArray();
    }

    public void addCliente(Cliente c){
        this.clientes.add(c);
    }

    public Cliente removeCliente() {
        return clientes.poll();
    }
}
