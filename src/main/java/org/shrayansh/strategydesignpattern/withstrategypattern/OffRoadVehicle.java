package org.shrayansh.strategydesignpattern.withstrategypattern;

import org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy.DriveStrategy;
import org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public DriveStrategy driveStrategy;
    public OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }

}
