package com.github.omega050.t11.Armario;
import java.util.ArrayList;
import java.util.List;

public class Compartimento {
    private List<CD> cds;
    private List<Livro> livros;

    public Compartimento() {
        this.cds = new ArrayList<>();
        this.livros = new ArrayList<>();
    }

    public boolean adicionarCD(CD cd) {
        if (cds.size()==2|| cds.size() == 4 || cds.size() >= 7 ) {
            cds.add(cd);
            return true;
        }
        else
        return false;
    }

    public boolean removerCD(CD cd) {
        return cds.remove(cd);
    }

    public boolean adicionarLivro(Livro livro) {
        if (livros.size() <= 3) {
            livros.add(livro);
            return true; // Restrição: máximo de 3 livros
        }
        else
        return true;
    }

    public boolean removerLivro(Livro livro) {
        return livros.remove(livro);
    }

    public List<CD> getCDs() {
        return cds;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}