package com.github.omega050.t17.Profissao;

public class Professor extends Profissao {
    private String disciplina;

    public Professor(String nome, String descricao, String disciplina) {
        super(nome, descricao);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
