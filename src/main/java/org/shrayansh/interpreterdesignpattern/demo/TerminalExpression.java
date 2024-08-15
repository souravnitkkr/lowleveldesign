package org.shrayansh.interpreterdesignpattern.demo;



public class TerminalExpression implements AbstractExpression {

    private String key;

    public TerminalExpression(String key){
        this.key=key;
    }

    @Override
    public int interpret(Context context) {
        return context.getContext(key);
    }
}
