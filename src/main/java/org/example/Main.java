package org.example;
import java.util.Scanner;
// коммит
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выхода из программы введите q");
        System.out.println("Выбрана 10-чная система счичления. Для выбора системы счисления введите s2, s8, s10, s12");
        String systems = "10"; // изначальная система счисления
        boolean flag = true;
        while (flag)// цикл программы
        {
            System.out.println("Введите первое число");
            Number num1 = null;
            boolean flagnum1 = true;
            while (flagnum1) {
                String input = scanner.nextLine();
                if (input.equals("q")) {
                    flag = false;
                    break;
                }
                if (input.equals("s2") || input.equals("s8") || input.equals("s10") || input.equals("s16")) {
                    systems = input.substring(1);
                    System.out.println("Выбрана " + systems + "-ная система");
                    continue;
                }
                try {
                    switch (systems){
                        case "2":
                            num1 = new BinaryNumber(input);
                            break;
                        case "8":
                            num1 = new OctalNumber(input);
                            break;
                        case "10":
                            num1 = new DecimalNumber(input);
                            break;
                        case "16":
                            num1 = new HexadecimalNumber(input);
                            break;
                    }
                    System.out.println(num1.getValue()+" "+num1.getRadix()+"-ная система счисления");
                    flagnum1 = false;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод числа. Попробуйте снова.");
                }
            }
            if (!flag) {
                break;
            }
            System.out.println("Введите операцию");
            String op = "";
            boolean flagop = true;
            while (flagop) {
                String operation = scanner.nextLine();
                if (operation.equals("q")) {
                    flag = false;
                    break;
                }
                if (operation.equals("s2") || operation.equals("s8") || operation.equals("s10") || operation.equals("s16")) {
                    systems = operation.substring(1);
                    System.out.println("Выбрана " + systems + "-ная система");
                    continue;
                }
                if (operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*")) {
                    op = operation;
                    flagop = false;
                } else {
                    System.out.println("Некорректная операция. Пожалуйста, введите одну из следующих: +, -, /, *");
                }
            }
            if (!flag) {
                break;
            }
            System.out.println("Введите второе число");
            Number num2 = null;
            boolean flagnum2 = true;
            while (flagnum2) {
                String input = scanner.nextLine();
                if (input.equals("q")) {
                    flag = false;
                    break;
                }
                if (input.equals("s2") || input.equals("s8") || input.equals("s10") || input.equals("s16")) {
                    systems = input.substring(1);
                    System.out.println("Выбрана " + systems + "-ная система");
                    continue;
                }
                try {
                    switch (systems){
                        case "2":
                            num2 = new BinaryNumber(input);
                            break;
                        case "8":
                            num2 = new OctalNumber(input);
                            break;
                        case "10":
                            num2 = new DecimalNumber(input);
                            break;
                        case "16":
                            num2 = new HexadecimalNumber(input);
                            break;
                    }
                    System.out.println("Решение " + num2.getValue()+" "+num2.getRadix()+"-ная система счисления");
                    flagnum2 = false;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод числа. Попробуйте снова.");
                }
            }
            if (flag == false) {
                break;
            }
            try {
                Number Result = Calculator.calculate(num1, num2, op);
                //System.out.println("Результат: " + Result.getValue());
                System.out.println("Результат");
                Result.getAllRadix();
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
        System.out.println("Вы вышли из программы.");
    }
}