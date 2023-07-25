package com.github.omega050.t17.Pagamento;

public class Tarefa {
    private String nome;
    private Pagamento pagamento;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}
