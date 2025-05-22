package org.example;

public class DecimalNumber extends Number {
    public DecimalNumber(String value) {
        super(value, 10);
    }

    @Override
    public Number add(Number other) {
        long result = this.toDecimal() + other.toDecimal();
        return new DecimalNumber(fromDecimal(result));
    }

    @Override
    public Number subtract(Number other) {
        long result = this.toDecimal() - other.toDecimal();
        return new DecimalNumber(fromDecimal(result));
    }

    @Override
    public Number multiply(Number other) {
        long result = this.toDecimal() * other.toDecimal();
        return new DecimalNumber(fromDecimal(result));
    }

    @Override
    public Number divide(Number other) {
        if(other.toDecimal() == 0)
        {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        long result = this.toDecimal() / other.toDecimal();
        return new DecimalNumber(fromDecimal(result));
    }
}
