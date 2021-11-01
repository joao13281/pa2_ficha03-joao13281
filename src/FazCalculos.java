import java.util.Scanner;

public class FazCalculos {
    public static void main(String[] args) {


        Calculadora calculator = new Calculadora();


        System.out.println("Sum = " + calculator.sum(5.2, 2.7));
        System.out.println("Sum 3 num = " + calculator.sum(5.2, 2.7, 3.1));
        System.out.println("\nMinus = " + calculator.minus(5.2, 2.7));
        System.out.println("Minus 3 num = " + calculator.minus(5.2, 2.7, 3.1));
        System.out.println("\nMultiply = " + calculator.multiply(5.2, 2.7));
        System.out.println("Multiply 3 num = " + calculator.multiply(5.2, 2.7, 3.1));
        System.out.println("\nDivide = " + calculator.divide(5.2, 2.7));
        System.out.println("Divide 3 num = " + calculator.divide(5.2, 2.7, 3.1));
    }
}
