package com.github.omega050.t12.Arvore2;

import java.util.ArrayList;
import java.util.List;

public class Arvore2<T> {
    Node<T> root;
    
    public Arvore2(T valR){
        root= new Node<>(valR); 
    }
    public Node<T> getRoot() {
        return root;
    }
}
class Node<T>{
    T val;  
    Node<T> Father;
    private List<Node<T>> childList;
    Node<T> brother;

    public Node(T val){
        this.val = val;
        this.childList = new ArrayList<>();
        }

        public T getVal() {
            return val;
        }

        public void addChild(Node<T> child){
            child.setFather(this);
            this.childList.add(child);
        }
        public void setFather(Node<T> Father) {
            this.Father = Father;
        }

        public Node<T> getFather() {
            return Father;
        }

        public List<Node<T>> getChildList() {
            return childList;
        }   

        public void setBrother(Node<T> brother) {
            this.brother = brother;
        }

        public boolean isHasChild(){
            return childList.isEmpty();
        }
}
