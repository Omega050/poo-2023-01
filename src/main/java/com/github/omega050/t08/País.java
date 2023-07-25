package com.github.omega050.t08;
import java.util.ArrayList;
public class País {
    public ArrayList<String> cidade;
    public String Capital;
    public País(){
        this.cidade = new ArrayList<>();
    }
    public void addCidade(String nCidade){
        cidade.add(nCidade);
    }
    public ArrayList<String> getCidades() {
        return cidade;
    }
    public void setCidades(ArrayList<String> cidades) {
        this.cidade = cidades;
    }
    public void setCapital(String nCidade){
        Capital = nCidade;
    }
    public String getCapital(){
        return Capital;
    }
}
