package com.github.omega050.t13;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    public List<Medicamento> medicamentos;

    public Estoque(Medicamento a) {
        this.medicamentos = new ArrayList<>();
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}
