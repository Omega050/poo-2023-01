package t07.pooJavaMauro;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private List<Curso> cursos;

    public Aluno(Curso c){
        this.cursos = new ArrayList<>();
        cursos.add(c);
    }
    public List<Curso> getCursos() {
        return cursos;
    }
}
