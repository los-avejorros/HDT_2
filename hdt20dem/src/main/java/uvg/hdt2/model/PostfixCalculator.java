package uvg.hdt2.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PostfixCalculator implements IPostfixCalculator {
    private Pila<Double> stack;
    String expression;
    public PostfixCalculator(Pila<Double> stack) { this.stack = stack; }
    public void readFromFile(String path) throws IOException { try (BufferedReader br = new BufferedReader(new FileReader(path))) { expression = br.readLine(); } }
    public double evaluateExpression() { /* Evaluación de la expresión */ return 0.0; }
}
