package t18;
public class Prova {
    private Peça peça;
    private int linha;
    private int coluna;

    public Prova(Peça peça, int linha, int coluna) {
        this.peça = peça;
        this.linha = linha;
        this.coluna = coluna;
    }

    public Peça getPeça() {
        return peça;
    }

    public String getPosicaoNotacao() {
        return Tabuleiro.obterPosicaoNotacao(linha, coluna);
    }
}