package com.github.omega050.t22;

import java.util.ArrayList;
import java.util.List;

public class PostoPolicia {
    private Colaborador representanteJustica;
    private Colaborador representantePolicia;
    private List<Ocorrencia> ocorrencias;


    public PostoPolicia(Colaborador representanteJustica, Colaborador representantePolicia) {
        this.representanteJustica = representanteJustica;
        this.representantePolicia = representantePolicia;
        this.ocorrencias = new ArrayList<>();
    }

    public Colaborador getRepresentanteJustica() {
        return this.representanteJustica;
    }

    public void setRepresentanteJustica(Colaborador representanteJustica) {
        this.representanteJustica = representanteJustica;
    }

    public Colaborador getRepresentantePolicia() {
        return this.representantePolicia;
    }

    public void setRepresentantePolicia(Colaborador representantePolicia) {
        this.representantePolicia = representantePolicia;
    }

    public List<Ocorrencia> getOcorrencias() {
        return this.ocorrencias;
    }

    public void addOcorrencias(Ocorrencia ocorrencia) {
        this.ocorrencias.add(ocorrencia);
    }
}