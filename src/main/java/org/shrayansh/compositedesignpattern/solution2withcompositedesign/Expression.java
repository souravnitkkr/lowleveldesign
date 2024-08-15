package org.shrayansh.compositedesignpattern.solution2withcompositedesign;

public class Expression implements ArithmeticExpression{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operator operator;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operator operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    @Override
    public int evaluate() {
        int value=0;
        switch (operator){
            case ADD: value = leftExpression.evaluate() + rightExpression.evaluate();
                      break;
            case SUBTRACT: value = leftExpression.evaluate() - rightExpression.evaluate();
                           break;
            case MULTIPLY: value = leftExpression.evaluate() * rightExpression.evaluate();
                           break;
            case DIVIDE: value = leftExpression.evaluate() / rightExpression.evaluate();
                         break;
        }
        return value;
    }
}
