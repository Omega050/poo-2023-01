package t12;

public class Pilha {
    private int size = 0;
    private int stack[];
    
    public Pilha(int capacity) {
        stack = new int[capacity];
    }
    
    public void push(int val) throws Exception {
        if (size == stack.length) {
            throw new Exception("A pilha está cheia.");
        }
        stack[size++] = val;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia.");
        }
        return stack[--size];
    }
}