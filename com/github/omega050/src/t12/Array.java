package t12;
public class Array<T> {
    private T[] elementos;

    public Array(int tamanho) {
        elementos = (T[]) new Object[tamanho];
    }

    public void setElemento(int indice, T elemento) {
        elementos[indice] = elemento;
    }

    public T getElemento(int indice) {
        return elementos[indice];
    }

    public int getTamanho() {
        return elementos.length;
    }
}