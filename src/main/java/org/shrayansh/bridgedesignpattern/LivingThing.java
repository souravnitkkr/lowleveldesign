package org.shrayansh.bridgedesignpattern;

public abstract class LivingThing {
    BreatheImplementor breatheImplementor;

    public LivingThing(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breatheProcess();
}
