package mypack;

public class Calculator<T extends Number> {
    
    public T add(T operand1, T operand2) {
        return (T) Double.valueOf(operand1.doubleValue() + operand2.doubleValue());
    }

    public T subtract(T operand1, T operand2) {
        return (T) Double.valueOf(operand1.doubleValue() - operand2.doubleValue());
    }

    public T multiply(T operand1, T operand2) {
        return (T) Double.valueOf(operand1.doubleValue() * operand2.doubleValue());
    }

    public T divide(T operand1, T operand2) {
        if (operand2.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (T) Double.valueOf(operand1.doubleValue() / operand2.doubleValue());
    }
}

class TestCalculator {

    public static void main(String[] args) 
    {
        // Integer Calculator
        Calculator<Integer> intCalculator = new Calculator<>();

        System.out.println("Integer Calculator:");
        System.out.println("Addition: " + intCalculator.add(5, 3));
        System.out.println("Subtraction: " + intCalculator.subtract(8, 2));
        System.out.println("Multiplication: " + intCalculator.multiply(4, 5));
        System.out.println("Division: " + intCalculator.divide(9, 3));

        // Double Calculator
        Calculator<Double> doubleCalculator = new Calculator<>();

        System.out.println("\nDouble Calculator:");
        System.out.println("Addition: " + doubleCalculator.add(5.5, 3.2));
        System.out.println("Subtraction: " + doubleCalculator.subtract(8.7, 2.1));
        System.out.println("Multiplication: " + doubleCalculator.multiply(4.5, 2.5));
        System.out.println("Division: " + doubleCalculator.divide(9.0, 3.0));
    }
}
