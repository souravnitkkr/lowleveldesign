package org.shrayansh.bridgedesignpattern;

public class Dog extends LivingThing{
    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
