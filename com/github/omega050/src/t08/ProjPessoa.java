package com.github.omega050.src.t08;
import java.util.List;
import java.util.ArrayList;
public class ProjPessoa {
    public String nome;
    private List<ProjPessoa> integrantes;

    public ProjPessoa(String nome){
        this.nome = nome;
        this.integrantes = new ArrayList<>();
    }
    public void adicionarPessoa(ProjPessoa pessoa) {
        integrantes.add(pessoa);
    }

    public String getNome() {
        return nome;
    }

    public List<ProjPessoa> getPessoas() {
        return integrantes;
    }
}

