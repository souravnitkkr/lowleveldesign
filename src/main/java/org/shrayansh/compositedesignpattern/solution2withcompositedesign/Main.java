package org.shrayansh.compositedesignpattern.solution2withcompositedesign;


public class Main {
    public static void main(String[] args) {
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);
        ArithmeticExpression rightExpression = new Expression(one,seven,Operator.ADD);
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression arithmeticExpression = new Expression(two,rightExpression,Operator.MULTIPLY);
        System.out.println("Expressions value = "+arithmeticExpression.evaluate());
    }
}
