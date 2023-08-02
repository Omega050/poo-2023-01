package com.github.omega050.t19.Usuario;

public class PermissaoArquivo {
    private Usuario usuario;
    private Arquivo arquivo;
    private boolean leitura;
    private boolean escrita;
    private boolean execucao;

    public PermissaoArquivo(Usuario usuario, Arquivo arquivo, boolean leitura, boolean escrita, boolean execucao) {
        this.usuario = usuario;
        this.arquivo = arquivo;
        this.leitura = leitura;
        this.escrita = escrita;
        this.execucao = execucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public boolean temLeitura() {
        return leitura;
    }

    public boolean temEscrita() {
        return escrita;
    }

    public boolean temExecucao() {
        return execucao;
    }
}