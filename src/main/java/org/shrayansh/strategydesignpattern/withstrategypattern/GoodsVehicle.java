package org.shrayansh.strategydesignpattern.withstrategypattern;

import org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy.DriveStrategy;
import org.shrayansh.strategydesignpattern.withstrategypattern.drivestrategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    private DriveStrategy driveStrategy;
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }

}
