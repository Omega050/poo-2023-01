package com.github.omega050.t17.NotaFiscal;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private List<Produto> produtos;
    private long precoTotal;

    public NotaFiscal() {
        this.produtos = new ArrayList<>();
    }

    public void addProduto(Produto p) {
        this.produtos.add(p);
        this.precoTotal += (p.getPreço() * p.getQuantidade());
    }

    public long getPrecoTotal() {
        return precoTotal;
    }
}
