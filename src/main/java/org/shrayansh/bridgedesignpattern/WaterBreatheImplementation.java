package org.shrayansh.bridgedesignpattern;

public class WaterBreatheImplementation implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("breathe through gills");
        System.out.println("absorb oxygen from water");
        System.out.println("release carbon-dioxide");
    }
}
