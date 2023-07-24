package t09.CaixeiroViajante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    int id;
    List<Produto> produtos;

    public Pedido(int id, Produto produto){
        this.id = id;
        this.produtos = new ArrayList<>();
        produtos.add(produto);
    }

}
