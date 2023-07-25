package com.github.omega050.t13;

import java.util.ArrayList;
import java.util.List;

public class Hospital{
    public String nome;
    public String endereço;
    private List<Paciente> internados;
    private List<Funcionario> funcionarios;
    private List<Medico> medicos;
    public List<Ambulancia> ambulancias;

    public Hospital(String n, String end){
        this.nome = n;
        this.endereço = end;
        this.internados = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.ambulancias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public List<Paciente> getInternados() {
        return internados;
    }

    public List<Ambulancia> getAmbulancias() {
        return ambulancias;
    }

    public void agendarConsulta(Paciente p, Medico m){
        
    }
}