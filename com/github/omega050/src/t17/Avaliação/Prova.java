package t17.Avaliação;

public class Prova {
    private Avaliacao avaliacao;
    private Aluno aluno;
    private String respostas;

    public Prova(Avaliacao avaliacao, Aluno aluno, String respostas) {
        this.avaliacao = avaliacao;
        this.aluno = aluno;
        this.respostas = respostas;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public String getRespostas() {
        return respostas;
    }
}
