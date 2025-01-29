package uvg.hdt2.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostfixCalculatorTest {
    
    @Test
    void testEvaluarExpresionBasica() {
        Pila<Double> pila = new VectorPila<>();
        PostfixCalculator calculator = new PostfixCalculator(pila);
        double resultado = calculator.evaluateExpression();
        assertEquals(5.0, resultado);
    }

    @Test
    void testEvaluarExpresionCompleja() {
        Pila<Double> pila = new VectorPila<>();
        PostfixCalculator calculator = new PostfixCalculator(pila);
        double resultado = calculator.evaluateExpression();
        assertEquals(30.0, resultado);
    }

    @Test
    void testDivisionPorCero() {
        Pila<Double> pila = new VectorPila<>();
        PostfixCalculator calculator = new PostfixCalculator(pila);
        assertThrows(ArithmeticException.class, () -> calculator.evaluateExpression());
    }

    @Test
    void testExpresionInvalida() {
        Pila<Double> pila = new VectorPila<>();
        PostfixCalculator calculator = new PostfixCalculator(pila);
        assertThrows(IllegalArgumentException.class, () -> calculator.evaluateExpression());
    }
}
