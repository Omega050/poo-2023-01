package com.github.omega050.t11.Carne;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Item> itemList;
    private double valTotal;

    public Compra() {
        this.itemList = new ArrayList<>();
        this.valTotal = 0;
    }

    public void adicionarItem(Item item) {
        itemList.add(item);
        valTotal += item.getValorAc();
    }

    public void removerItem(Item item) {
        itemList.remove(item);
        valTotal -= item.getValorAc();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public double getValTotal() {
        return valTotal;
    }
}