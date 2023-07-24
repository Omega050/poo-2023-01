package t09.Conteiner;

import java.util.ArrayList;
import java.util.List;

public class Conteiner extends Elemento {
        private List<Elemento> elementos;

    public Conteiner() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public List<Elemento> getElementos() {
        return elementos;
    
}
}
