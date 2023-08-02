package com.github.omega050.t19.Usuario;

import java.util.HashMap;
import java.util.Map;

public class Disco {
    private Map<String, Arquivo> arquivos;

    public Disco() {
        arquivos = new HashMap<>();
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.put(arquivo.getNome(), arquivo);
    }

    public Arquivo getArquivo(String nome) {
        return arquivos.get(nome);
    }
}