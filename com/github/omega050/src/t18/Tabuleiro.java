package t18;
public class Tabuleiro {
    public Peça[][] N;

    public Tabuleiro() {
        N = new Peça[8][8];
    }

    public void posicionarPeça(Peça peça, int linha, int coluna) {
        N[linha][coluna] = peça;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                Peça peça = N[linha][coluna];
                if (peça != null) {
                    sb.append(peça.getNome()).append(" na posição ").append(obterPosicaoNotacao(linha, coluna)).append("\n");
                }
            }
        }
        return sb.toString();
    }
    public static String obterPosicaoNotacao(int linha, int coluna) {
        char letra = (char) ('A' + coluna);
        int numero = 8 - linha;
        return letra + "" + numero;
    }
}