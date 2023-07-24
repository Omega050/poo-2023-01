package t17.Profissao;

public class Acougueiro extends Profissao {
    private String especialidade;

    public Acougueiro(String nome, String descricao, String especialidade) {
        super(nome, descricao);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}