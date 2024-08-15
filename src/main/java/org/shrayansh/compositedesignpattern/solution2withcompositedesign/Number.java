package org.shrayansh.compositedesignpattern.solution2withcompositedesign;

public class Number implements ArithmeticExpression{

    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        return this.number;
    }
}
