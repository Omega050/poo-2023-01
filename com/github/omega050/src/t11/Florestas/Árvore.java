package t11.Florestas;

import java.util.ArrayList;
import java.util.List;

public class Árvore {
    public List<Folha> folhas;
    public String nome;

    public Árvore(String n, Folha f){
        this.nome = n;
        this.folhas = new ArrayList<>(null);
        folhas.add(f);
        };
    public String getNome() {
        return nome;
    }
    }

