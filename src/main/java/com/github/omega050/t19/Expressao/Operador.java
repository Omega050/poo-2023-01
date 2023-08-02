package com.github.omega050.t19.Expressao;

class Operador implements Elemento {
    private char simbolo;
    private Elemento esquerda;
    private Elemento direita;

    public Operador(char simbolo, Elemento esquerda, Elemento direita) {
        this.simbolo = simbolo;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avaliar() {
        switch (simbolo) {
            case '+':
                return esquerda.avaliar() + direita.avaliar();
            case '-':
                return esquerda.avaliar() - direita.avaliar();
            case '*':
                return esquerda.avaliar() * direita.avaliar();
            case '/':
                return esquerda.avaliar() / direita.avaliar();
            default:
                throw new IllegalArgumentException("Operador inválido: " + simbolo);
        }
    }
}
