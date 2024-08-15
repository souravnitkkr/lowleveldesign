package org.shrayansh.interpreterdesignpattern;

public class MultiplyNonTerminalExpression implements AbstractExpression{
    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public MultiplyNonTerminalExpression(AbstractExpression leftExpression,AbstractExpression rightExpression){
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
    }


    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}
