package uvg.hdt2.model;

public interface Pila<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}

