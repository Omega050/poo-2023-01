package com.github.omega050.t17.Dispositivo;

public class Computador extends Dispositivo {
    private Mouse mouse;
    private Teclado teclado;
    private Monitor monitor;
    private PlacaMae placaMae;

    public Computador(Mouse mouse, Teclado teclado, Monitor monitor, PlacaMae placaMae) {
        this.mouse = mouse;
        this.teclado = teclado;
        this.monitor = monitor;
        this.placaMae = placaMae;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }
}