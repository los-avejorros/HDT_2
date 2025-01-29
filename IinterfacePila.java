package uvg.hdt2.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

interface Pila<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}

