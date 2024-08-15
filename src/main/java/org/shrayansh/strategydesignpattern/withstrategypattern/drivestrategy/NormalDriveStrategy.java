package org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
