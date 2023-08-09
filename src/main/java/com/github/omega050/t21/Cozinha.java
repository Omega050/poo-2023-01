package com.github.omega050.t21;

public class Cozinha {
    private ChefeCozinha chefe;

    public ChefeCozinha getChefe() {
        return chefe;
    }

    public void setChefe(ChefeCozinha chefe) {
        this.chefe = chefe;
    }


    public Cozinha(ChefeCozinha chefe) {
        this.chefe = chefe;
    }
}
