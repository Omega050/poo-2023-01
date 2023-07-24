package t09.Transacao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nomeC;
    private List<Transacao> transacoes;

    public Cliente(String n, Transacao t){
        this.nomeC = n;
        this.transacoes = new ArrayList<>();
    }
    public String getNomeC() {
        return nomeC;
    }
    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
