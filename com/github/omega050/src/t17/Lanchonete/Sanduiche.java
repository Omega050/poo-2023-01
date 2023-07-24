package t17.Lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Sanduiche {
    private String nome;
    private List<Acompanhamento> acompanhamentos;

    public Sanduiche(String nome) {
        this.nome = nome;
        acompanhamentos = new ArrayList<>();
    }

    public void adicionarAcompanhamento(Acompanhamento acompanhamento) {
        acompanhamentos.add(acompanhamento);
    }

    public String getNome() {
        return nome;
    }

    public List<Acompanhamento> getAcompanhamentos() {
        return acompanhamentos;
    }
}