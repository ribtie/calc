package org.example;

public class OctalNumber extends Number {
    public OctalNumber(String value) {
        super(value, 8);
    }

    @Override
    public Number add(Number other) {
        long result = this.toDecimal() + other.toDecimal();
        return new OctalNumber(fromDecimal(result));
    }

    @Override
    public Number subtract(Number other) {
        long result = this.toDecimal() - other.toDecimal();
        return new OctalNumber(fromDecimal(result));
    }

    @Override
    public Number multiply(Number other) {
        long result = this.toDecimal() * other.toDecimal();
        return new OctalNumber(fromDecimal(result));
    }

    @Override
    public Number divide(Number other) {
        if(other.toDecimal() == 0)
        {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        long result = this.toDecimal() / other.toDecimal();
        return new OctalNumber(fromDecimal(result));
    }
}
