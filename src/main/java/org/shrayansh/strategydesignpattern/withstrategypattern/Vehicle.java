package org.shrayansh.strategydesignpattern.withstrategypattern;

import org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy.DriveStrategy;

public class Vehicle {

    public DriveStrategy strategy;

    //this is known as constructor injection
    public Vehicle(DriveStrategy driveStrategy){
        this.strategy=driveStrategy;
    }

    public void drive(){
        strategy.drive();
    }

}
