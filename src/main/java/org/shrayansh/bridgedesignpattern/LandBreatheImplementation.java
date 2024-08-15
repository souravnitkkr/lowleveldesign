package org.shrayansh.bridgedesignpattern;

public class LandBreatheImplementation implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathe through nose");
        System.out.println("Inhale oxygen from air");
        System.out.println("Exhale carbon-dioxide");
    }
}
