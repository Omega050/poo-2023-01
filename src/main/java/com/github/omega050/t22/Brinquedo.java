package com.github.omega050.t22;

import java.util.List;

public class Brinquedo {
    private boolean pago;
    private List<Bilhete> bilhetesValidos;
    
    public Brinquedo(boolean pago, List<Bilhete> bilhetesValidos) {
        this.pago = pago;
        this.bilhetesValidos = bilhetesValidos;
    }


    public boolean isPago() {
        return this.pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public List<Bilhete> getBilhetesValidos() {
        return this.bilhetesValidos;
    }

    public void setBilhetesValidos(List<Bilhete> bilhetesValidos) {
        this.bilhetesValidos = bilhetesValidos;
    }
}