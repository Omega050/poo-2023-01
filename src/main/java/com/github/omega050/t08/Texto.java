package com.github.omega050.t08;
import java.util.ArrayList;
import java.util.List;

public class Texto {
    private List<List<String>> paragrafos;

    public Texto() {
        this.paragrafos = new ArrayList<>();
    }

    public void adicionarParagrafo(List<String> sentencas) {
        paragrafos.add(sentencas);
    }

    public List<List<String>> getParagrafos() {
        return paragrafos;
    }

    public void setParagrafos(List<List<String>> paragrafos) {
        this.paragrafos = paragrafos;
    }
}