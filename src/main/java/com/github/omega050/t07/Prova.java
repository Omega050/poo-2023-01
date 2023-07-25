package com.github.omega050.t07;

public class Prova implements Ident {
    private int nQuest;

    public Prova(int n) {
        this.nQuest = n;
    }

    public int get_nQuest() {
        return nQuest;
    }

    public void set_nQuest(int n) {
        if (n > 0)
            nQuest = n;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}
