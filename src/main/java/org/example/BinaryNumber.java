package org.example;

public class BinaryNumber extends Number {
    public BinaryNumber(String value) {
        super(value, 2);
    }

    @Override
    public Number add(Number other) {
        long result = this.toDecimal() + other.toDecimal();
        return new BinaryNumber(fromDecimal(result));
    }

    @Override
    public Number subtract(Number other) {
        long result = this.toDecimal() - other.toDecimal();
        return new BinaryNumber(fromDecimal(result));
    }

    @Override
    public Number multiply(Number other) {
        long result = this.toDecimal() * other.toDecimal();
        return new BinaryNumber(fromDecimal(result));
    }

    @Override
    public Number divide(Number other) {
        if(other.toDecimal() == 0)
        {
            throw new ArithmeticException("Деление на ноль.");
        }
        long result = this.toDecimal() / other.toDecimal();
        return new BinaryNumber(fromDecimal(result));
    }
}
