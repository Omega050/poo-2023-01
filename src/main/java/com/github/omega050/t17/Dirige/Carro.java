package com.github.omega050.t17.Dirige;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private float motor;
    private String condição;

    public Carro(String m, int a, float motor, String marca, String condição){
        this.modelo = m;
        this.marca = marca;
        this.ano = a;
        this.motor = motor;
        this.condição = condição;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }
    public String getCondição() {
        return condição;
    }
    public float getMotor() {
        return motor;
    }
}
