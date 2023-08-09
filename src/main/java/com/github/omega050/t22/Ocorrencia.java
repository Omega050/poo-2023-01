package com.github.omega050.t22;

public class Ocorrencia {
    private String descricao;
    private String local;
    private String dataHora;

    public Ocorrencia(String descricao, String local, String dataHora) {
        this.descricao = descricao;
        this.local = local;
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDataHora() {
        return this.dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }    
}
