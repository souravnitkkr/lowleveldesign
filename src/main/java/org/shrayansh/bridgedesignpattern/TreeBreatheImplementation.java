package org.shrayansh.bridgedesignpattern;

public class TreeBreatheImplementation implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathe through leaves");
        System.out.println("Inhale carbon-dioxide");
        System.out.println("Exhale oxygen through photosynthesis");
    }
}
