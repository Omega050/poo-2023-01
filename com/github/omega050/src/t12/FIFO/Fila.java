package t12.FIFO;

public class Fila {
    private int front;
    private int rear;
    private int size = 0;
    private Node qu[];

    public Fila(int capacity) {
        qu = new Node[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == qu.length;
    }

    public void enqueue(Node n) throws Exception {
        if (isFull()) {
            throw new Exception("A fila está cheia.");
        }

        rear = (rear + 1) % qu.length;
        qu[rear] = n;
        size++;
    }

    public Node dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("A fila está vazia.");
        }

        Node first = qu[front];
        qu[front] = null;
        front = (front + 1) % qu.length;
        size--;
        return first;
    }
}