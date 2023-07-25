package com.github.omega050.t17.Dispositivo;

public class PlacaMae extends Dispositivo {
    private CPU cpu;
    private Memoria memoria;

    public PlacaMae(CPU cpu, Memoria memoria) {
        this.cpu = cpu;
        this.memoria = memoria;
    }

    public CPU getCPU() {
        return cpu;
    }

    public Memoria getMemoria() {
        return memoria;
    }

}
