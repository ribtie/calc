package org.example;

public abstract class Number {
    protected String value; // значение числа
    protected int radix; // система счисления числа
    // конструктор числа
    public Number(String value, int radix) {
        this.value = value;
        this.radix = radix;
    }
    // операция сложения
    public abstract Number add(Number other);
    // операция вычитания
    public abstract Number subtract(Number other);
    // операция умножения
    public abstract Number multiply(Number other);
    // операция деления
    public abstract Number divide(Number other);
    // вывод значения числа
    public String getValue() {
        return value;
    }
    // вывод системы счисления числа
    public int getRadix() {
        return radix;
    }
    // преобразование значения числа в десятичную систему счисления
    protected long toDecimal() {
        return Long.parseLong(value, radix);
    }
    // преобразование десятичного числа в другую систему счисления
    protected String fromDecimal(long decimalValue) {
        return Long.toString(decimalValue, radix);
    }
    // метод вывода числа в различных системах счисления
    public void getAllRadix(){
        long decimalValue = toDecimal();
        System.out.println("2-ная "+Long.toString(decimalValue, 2));
        System.out.println("8-ная "+Long.toString(decimalValue, 8));
        System.out.println("10-ная "+decimalValue);
        System.out.println("16-ная "+Long.toString(decimalValue, 16));
    }
}