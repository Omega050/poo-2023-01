package com.github.omega050.t07;

public class Permuta {
    public static void permutação(String p, String S) {
        if (S.length() == 1) {
            System.out.println(p + S);
        } else {
            String sLinha;
            String pLinha;
            for (int i = 0; i < S.length(); i++) {
                sLinha = S.substring(0, i) + S.substring(+1);
                pLinha = p + S.charAt(i);
                permutação(pLinha, sLinha);
            }
        }
    }
}
