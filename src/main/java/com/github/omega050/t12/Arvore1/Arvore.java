package com.github.omega050.t12.Arvore1;

import java.util.ArrayList;
import java.util.List;

public class Arvore<T> {
    Node<T> root;
    
    public Arvore(T valR){
        root= new Node<>(valR);
    }

    public Node<T> getRoot() {
        return root;
    }
}
class Node<T>{
    T val;  
    private List<Node<T>> childList;
    public Node(T val){
        this.val = val;
        this.childList = new ArrayList<>();
        }

        public T getVal() {
            return val;
        }

        public void addChild(Node<T> child){
            this.childList.add(child);
        }

        public List<Node<T>> getChildList() {
            return childList;
        }  
         
        public boolean isHasChild(){
            return childList.isEmpty();
        }
}
