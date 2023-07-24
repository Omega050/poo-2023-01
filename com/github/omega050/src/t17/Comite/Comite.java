package t17.Comite;

import java.util.ArrayList;
import java.util.List;

import t07.pooJavaMauro.Pessoa;

public class Comite {
    public List<Pessoa> membros;
    public Pessoa Presidente; 

    public Comite(Pessoa p){
        this.membros = new ArrayList<>();
        this.Presidente = p;
    }
    public Pessoa getPresidente() {
        return Presidente;
    }
    public List<Pessoa> getMembros() {
        return membros;
    }
}
