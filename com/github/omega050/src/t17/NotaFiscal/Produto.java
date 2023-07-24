package t17.NotaFiscal;

public class Produto {
    private String nome;
    private float preço;
    private int quantidade;

    public Produto(String n, float p, int q ){
        this.nome = n;
        this.preço = p;
        this.quantidade = q;
    }
    
    public String getNome() {
        return nome;
    }
    public float getPreço() {
        return preço;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
