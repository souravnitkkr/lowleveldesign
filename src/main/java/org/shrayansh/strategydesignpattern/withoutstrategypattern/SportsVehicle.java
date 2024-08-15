package org.shrayansh.strategydesignpattern.withoutstrategypattern;

public class SportsVehicle extends Vehicle {
    @Override
    public void drive() {

        //different drive capability
        System.out.println("Sports drive capability");
    }
}
