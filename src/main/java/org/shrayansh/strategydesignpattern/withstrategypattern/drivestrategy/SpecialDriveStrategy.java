package org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}
