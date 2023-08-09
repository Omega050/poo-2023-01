package com.github.omega050.t21;
import java.util.ArrayList;
import java.util.List;

class Restaurante {
    private List<Mesa> mesas;
    private List<Garcom> garcons;
    private List<Pedido> pedidos;
   

    public Restaurante() {
    }

    public Restaurante(List<Mesa> mesas, List<Garcom> garcons, List<Pedido> pedidos) {
        this.mesas = new ArrayList<>();
        this.garcons = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public List<Mesa> getMesas() {
        return this.mesas;
    }

    public void addMesa(Mesa mesa) {
        this.mesas.add(mesa);
    }

    public List<Garcom> getGarcons() {
        return this.garcons;
    }

    public void addGarcom(Garcom garcom) {
        this.garcons.add(garcom);
    }

    public List<Pedido> getPedidos() {
        return this.pedidos;
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
    
}
