package t17.NotaFiscal;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private List<Produto> produtos;
    private long preçoTotal;

    public NotaFiscal(){
        this.produtos = new ArrayList<>();
    }

    public void addProduto(Produto p){
        this.produtos.add(p);
        this.preçoTotal+=(p.getPreço()*p.getQuantidade());
    }
    public long getPreçoTotal() {
        return preçoTotal;
    }
}
