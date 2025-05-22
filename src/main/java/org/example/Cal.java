package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
// класс расчитан для записи числа в 4 системах счисления и проведения элементарных математических операций с ними (+ - / * )
public class Cal {
    private long num;
    public Cal(){}
    private final Map<String, String> numSystems = new LinkedHashMap<>();

    public void setNum(long num) { // словарь в котором хранятся значения в различных системах значения
        this.num = num;
        numSystems.put("Hex", Long.toHexString(num));
        numSystems.put("Dec", Long.toString(num));
        numSystems.put("Oct", Long.toOctalString(num));
        numSystems.put("Bin", Long.toBinaryString(num));
    }

    public Map<String, String> getNumSystems() {
        return numSystems;
    }
    // операция сложения
    public Cal add(Cal num2) {
        Cal result = new Cal();
        result.setNum(this.num+num2.num);
        return result;
    }
    // операция вычитания
    public Cal subtract(Cal num2) {
        Cal result = new Cal();
        result.setNum(this.num-num2.num);
        return result;
    }
    // операция умножения
    public Cal multiply(Cal num2) {
        Cal result = new Cal();
        result.setNum(this.num*num2.num);
        return result;
    }

    // операция деления
    public Cal divide(Cal num2) {
        if (num2.num == 0) { // проверяем деление на 0
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        Cal result = new Cal();
        result.setNum(this.num/num2.num);
        return result;
    }
}