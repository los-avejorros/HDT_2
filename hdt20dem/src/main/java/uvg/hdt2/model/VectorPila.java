package uvg.hdt2.model;

import java.util.Vector;

public class VectorPila<T> implements Pila<T> {
    private Vector<T> stack = new Vector<>();
    public void push(T item) { stack.add(item); }
    public T pop() { if (isEmpty()) throw new IllegalStateException("Pila vacía"); return stack.remove(stack.size() - 1); }
    public T peek() { if (isEmpty()) throw new IllegalStateException("Pila vacía"); return stack.lastElement(); }
    public boolean isEmpty() { return stack.isEmpty(); }
    public int size() { return stack.size(); }
}
