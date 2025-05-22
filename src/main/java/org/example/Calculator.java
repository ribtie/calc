package org.example;

public class Calculator {
    public static Number calculate(Number num1, Number num2, String operation) {
        switch (operation) {
            case "+":
                return num1.add(num2);
            case "-":
                return num1.subtract(num2);
            case "*":
                return num1.multiply(num2);
            case "/":
                return num1.divide(num2);
            default:
                throw new ArithmeticException("Недопустимая операция: " + operation);
        }
    }
}
