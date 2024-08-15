package org.shrayansh.bridgedesignpattern;

public class MainDriver {
    public static void main(String[] args) {
        LivingThing dogObject=new Dog(new LandBreatheImplementation());
        dogObject.breatheProcess();
        LivingThing fishObject=new Fish(new WaterBreatheImplementation());
        fishObject.breatheProcess();
    }
}
