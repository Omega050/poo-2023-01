package t11.Frase;

import java.util.ArrayList;
import java.util.List;

public class Frase {
    private List<Palavra> palavras;

    public Frase(Palavra p) {
        this.palavras = new ArrayList<>();
        palavras.add(p);
    }

    public void adicionarPalavra(Palavra palavra) {
        palavras.add(palavra);
    }

    public List<Palavra> getPalavras() {
        return palavras;
    }
}