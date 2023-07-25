package com.github.omega050.t07;
import java.util.Date;
public class Pessoa{
    public Date wasBorn;
    public String name;
    public Pessoa father;
    public Pessoa mother;

    public Pessoa(Date d, String n, Pessoa p, Pessoa m){
        this.wasBorn = d;
        this.name = n;
        this.father = p;
        this.mother = m;
    }
    public Pessoa getFather() {
        return father;
    }
    public Pessoa getMother() {
        return mother;
    }
    public String getName() {
        return name;
    }
    public Date getWasBorn() {
        return wasBorn;
    }
    public void setFather(Pessoa father) {
        this.father = father;
    }
    public void setMother(Pessoa mother) {
        this.mother = mother;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWasBorn(Date wasBorn) {
        this.wasBorn = wasBorn;
    }
}
