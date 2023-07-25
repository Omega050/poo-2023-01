package com.github.omega050.t07;

public class SomaNaturais {
    public static long somarNaturais(int n) {
        int c = 1;
        long s = 0;
        while (c <= n) {
            s = s + c;
            c++;
        }
        return s;
    }
}
