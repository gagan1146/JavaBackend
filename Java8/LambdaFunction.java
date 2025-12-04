import java.util.*;
import java.io.*;

interface MathOperations {
    int operate(int a, int b);
}

public class LambdaFunction {

    public static void main(String[] args) {

        MathOperations sumOperation = (a, b) -> a + b;
        MathOperations subOperation = (a, b) -> a - b;
        MathOperations divOperation = (a, b) -> a / b;
        MathOperations mulOperation = (a, b) -> a * b;

        System.out.println("Sum: " + sumOperation.operate(10, 21));
        System.out.println("Sub: " + subOperation.operate(10, 21));
        System.out.println("Div: " + divOperation.operate(10, 21));
        System.out.println("Mul: " + mulOperation.operate(10, 21));
    }
}
