package uvg.hdt2.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VectorPilaTest {
    @Test
    void testPushPop() {
        VectorPila<Integer> pila = new VectorPila<>();
        pila.push(10);
        assertEquals(10, pila.pop());
    }

    @Test
    void testPeek() {
        VectorPila<Integer> pila = new VectorPila<>();
        pila.push(20);
        assertEquals(20, pila.peek());
    }

    @Test
    void testIsEmpty() {
        VectorPila<Integer> pila = new VectorPila<>();
        assertTrue(pila.isEmpty());
    }
}