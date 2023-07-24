package com.github.omega050.src.t08;
import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private List<String> linguagens;

    public Projeto() {
        this.linguagens = new ArrayList<>();
    }

    public void insereLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }

    public List<String> getLinguagens() {
        return linguagens;
    }
}