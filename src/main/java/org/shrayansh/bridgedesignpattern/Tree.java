package org.shrayansh.bridgedesignpattern;

public class Tree extends LivingThing{
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
