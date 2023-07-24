package t09.Transacao;

import java.util.ArrayList;
import java.util.List;

public class Forncedor {
    public String nomeF;
    private List<Transacao> transacoes;

    public Forncedor(String n, Transacao t){
        this.nomeF = n;
        this.transacoes = new ArrayList<>();
    }
    public String getNomeF() {
        return nomeF;
    }
    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
