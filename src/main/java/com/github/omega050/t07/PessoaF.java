package com.github.omega050.t07;

import java.sql.Date;

public class PessoaF extends Pessoa {
    private long cpf;
    private String corDaPele;

    public PessoaF(Date wasborn, String name, long c, String nF, Pessoa p, Pessoa m) {
        super(wasborn, name, p, m);
        this.cpf = c;
        this.corDaPele = nF;
    }

    public long getcpf() {
        return cpf;
    }

    public String getcorDaPele() {
        return corDaPele;
    }

}
