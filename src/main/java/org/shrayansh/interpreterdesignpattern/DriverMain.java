package org.shrayansh.interpreterdesignpattern;

public class DriverMain {
    public static void main(String[] args) {
        Context context=new Context();
        context.setContext("a",1);
        context.setContext("b",2);
        context.setContext("c",3);
        context.setContext("d",4);

        AbstractExpression abstractExpression1=new MultiplyNonTerminalExpression(new TerminalExpression("a"),
                new TerminalExpression("b"));

        AbstractExpression abstractExpression2=new MultiplyNonTerminalExpression(new TerminalExpression("c"),
                new TerminalExpression("d"));

        AbstractExpression finalExpression=new SumNonTerminalExpression(abstractExpression1,abstractExpression2);

        System.out.println("Final output "+finalExpression.interpret(context));

    }
}
