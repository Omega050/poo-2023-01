package com.github.omega050.t07;

import java.sql.Date;

public class PessoaJ extends Pessoa {
    private long cnpj;
    private String nomeFantasia;

    public PessoaJ(Date wasborn, String name, long c, String nF, Pessoa p, Pessoa m) {
        super(wasborn, name, p, m);
        this.cnpj = c;
        this.nomeFantasia = nF;
    }

    public long getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
}
