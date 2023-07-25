package com.github.omega050.t07;
public class AlunoH extends Aluno{
    int id;

    public AlunoH(Curso c, int id){
        super(c);
        this.id = id;
    }
    public int getId() {
        return id;
    }
}


