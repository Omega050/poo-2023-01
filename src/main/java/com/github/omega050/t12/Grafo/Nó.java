package com.github.omega050.t12.Grafo;

public class Nó{
        int val;
        Aresta a; 

        public Nó(int val){
            this.val = val;
        }

        public void setVal(int val) {
            this.val = val;
        }
        
        public int getVal() {
            return val;
        }
}
