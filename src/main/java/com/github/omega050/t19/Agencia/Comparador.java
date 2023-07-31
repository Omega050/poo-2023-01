package com.github.omega050.t19.Agencia;

import java.util.Comparator;

public class Comparador implements Comparator<Cliente> {

    public int compare(Cliente c1, Cliente c2){
        if(c1.getPrioridade()<c2.getPrioridade())
            return 1;
        else if(c1.getPrioridade()>c2.getPrioridade())
            return -1;
                return 0;
    }
}
