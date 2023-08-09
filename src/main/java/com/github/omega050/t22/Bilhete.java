package com.github.omega050.t22;

public class Bilhete {
    private boolean universal;
    private Brinquedo brinquedo;
    private Pessoa comprador;
    private String dataHoraCompra;


    public Bilhete(boolean universal, Brinquedo brinquedo, Pessoa comprador, String dataHoraCompra) {
        this.universal = universal;
        this.brinquedo = brinquedo;
        this.comprador = comprador;
        this.dataHoraCompra = dataHoraCompra;
    }

    public boolean isUniversal() {
        return this.universal;
    }

    public boolean getUniversal() {
        return this.universal;
    }

    public void setUniversal(boolean universal) {
        this.universal = universal;
    }

    public Brinquedo getBrinquedo() {
        return this.brinquedo;
    }

    public void setBrinquedo(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    public Pessoa getComprador() {
        return this.comprador;
    }

    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }

    public String getDataHoraCompra() {
        return this.dataHoraCompra;
    }

    public void setDataHoraCompra(String dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }
}