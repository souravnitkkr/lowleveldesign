package org.shrayansh.strategydesignpattern.withstrategypattern;

import org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy.DriveStrategy;
import org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{

    public DriveStrategy driveStrategy;

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }

}
