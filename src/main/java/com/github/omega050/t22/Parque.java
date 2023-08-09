package com.github.omega050.t22;

import java.util.ArrayList;
import java.util.List;

public class Parque {
    private List<Colaborador> colaboradores;
    private List<Bilhete> bilhetesVendidos;
    private List<Brinquedo> brinquedos;
    private List<PostoPolicia> postosPolicia;
    private DiretorParque diretor;

    public Parque(DiretorParque diretor) {
        this.diretor = diretor;
        this.colaboradores = new ArrayList<>();
        this.bilhetesVendidos = new ArrayList<>();
        this.brinquedos = new ArrayList<>();
        this.postosPolicia = new ArrayList<>();
    }

    public void adicionarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    public void adicionarBrinquedo(Brinquedo brinquedo) {
        brinquedos.add(brinquedo);
    }

    public void adicionarPostoPolicia(PostoPolicia postoPolicia) {
        postosPolicia.add(postoPolicia);
    }

    public void venderBilhete(Bilhete bilhete) {
        bilhetesVendidos.add(bilhete);
    }

    public List<Colaborador> getColaboradores() {
        return this.colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public List<Bilhete> getBilhetesVendidos() {
        return this.bilhetesVendidos;
    }

    public void setBilhetesVendidos(List<Bilhete> bilhetesVendidos) {
        this.bilhetesVendidos = bilhetesVendidos;
    }

    public List<Brinquedo> getBrinquedos() {
        return this.brinquedos;
    }

    public void setBrinquedos(List<Brinquedo> brinquedos) {
        this.brinquedos = brinquedos;
    }

    public List<PostoPolicia> getPostosPolicia() {
        return this.postosPolicia;
    }

    public void setPostosPolicia(List<PostoPolicia> postosPolicia) {
        this.postosPolicia = postosPolicia;
    }

    public DiretorParque getDiretor() {
        return this.diretor;
    }

    public void setDiretor(DiretorParque diretor) {
        this.diretor = diretor;
    }
}