package t09.CaixeiroViajante;

public class Produto {
    public String nome;
    public int qtde;
    public Produto(String n, int qtde){
        this.nome = n;
        this.qtde = qtde;
    }
    public String getNome() {
        return nome;
    }
    public int getQtde() {
        return qtde;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}
