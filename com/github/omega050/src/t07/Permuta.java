package com.github.omega050.src.t07;
public class Permuta {
    public static void permutação(String p, String S){
        if(S.length() == 1){
            System.out.println(p+S);
        }else{
            String Slinha;
            String Plinha;
            for(int i = 0;i<S.length();i++){
            Slinha = S.substring(0, i) + S.substring(+1);
            Plinha = p+ S.charAt(i);
            permutação(Plinha,Slinha);
}
        }
    }
}
