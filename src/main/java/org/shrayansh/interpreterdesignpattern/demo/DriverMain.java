package org.shrayansh.interpreterdesignpattern.demo;


public class DriverMain {
    public static void main(String[] args) {
        Context context=new Context();
        context.setContext("a",1);
        context.setContext("b",2);
        context.setContext("c",3);
        context.setContext("d",4);

        //(a*b)+(c*d)
        AbstractExpression abstractExpression1=new BinaryNonTerminalExpression(new TerminalExpression("a"),
                new TerminalExpression("b"),'*');

        AbstractExpression abstractExpression2=new BinaryNonTerminalExpression(new TerminalExpression("c"),
                new TerminalExpression("d"),'*');

        AbstractExpression finalExpression = new BinaryNonTerminalExpression(abstractExpression1,abstractExpression2,'+' );

        System.out.println(finalExpression.interpret(context));

    }
}
