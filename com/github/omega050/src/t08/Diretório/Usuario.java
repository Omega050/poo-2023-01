package com.github.omega050.src.t08.Diretório;
import java.util.List;
import java.util.ArrayList;
public class Usuario {
    public String name;
    private String email;
    private List<String> donoDe;
    private List<String> podeAcessar;
    
    public Usuario(String n, String e){
        this.name = n;
        this.email = e;
        this.donoDe = new ArrayList<>(null);
        this.podeAcessar = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
        public void acesso(String diretorio) {
        this.podeAcessar.add(diretorio);
    }

    public List<String> getDonoDe() {
        return donoDe;
    }

    public List<String> getpodeAcessar() {
        return podeAcessar;
    }
}