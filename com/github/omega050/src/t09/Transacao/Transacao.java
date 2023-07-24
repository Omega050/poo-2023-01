package t09.Transacao;

public class Transacao {
    private Cliente cliente;
    private Forncedor fornecedor;

    public Transacao(Cliente cliente, Forncedor fornecedor){
        this.cliente = cliente;
        this.fornecedor = fornecedor;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Forncedor getFornecedor() {
        return fornecedor;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setFornecedor(Forncedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
