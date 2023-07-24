package t11.Lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
    private Funcionario gerente;
    private List<Funcionario> funcionarios;
    public String nomeLanc;

    public Lanchonete(Funcionario gerente, String nomeLanc) {
        this.gerente = gerente;
        this.nomeLanc = nomeLanc;
        this.funcionarios = new ArrayList<>();
    }

    public void addFunc(Funcionario f) {
        if (!funcionarios.contains(f)) {
            funcionarios.add(f);
        }
    }
    public String getNome(){
        return nomeLanc;
    }
    public Funcionario getGerente() {
        return gerente;
    }
}