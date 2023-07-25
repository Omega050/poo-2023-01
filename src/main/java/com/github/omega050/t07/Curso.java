package com.github.omega050.t07;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Aluno> alunos;

    public Curso(Aluno a) {
        this.alunos = new ArrayList<>();
        alunos.add(a);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
