package org.shrayansh.strategydesignpattern.withstrategypattern;

import org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy.DriveStrategy;
import org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{

    public DriveStrategy driveStrategy;

    public SportsVehicle() {
        super(new SpecialDriveStrategy());
    }

}
