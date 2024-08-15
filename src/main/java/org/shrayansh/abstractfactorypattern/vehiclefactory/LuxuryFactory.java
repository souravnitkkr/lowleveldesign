package org.shrayansh.abstractfactorypattern.vehiclefactory;

import org.shrayansh.abstractfactorypattern.vehicle.LuxuryVehicle1;
import org.shrayansh.abstractfactorypattern.vehicle.LuxuryVehicle2;
import org.shrayansh.abstractfactorypattern.vehicle.Vehicle;

public class LuxuryFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(int price) {
        if(price < 1000000)
            return new LuxuryVehicle1();
        else
            return new LuxuryVehicle2();
    }
}
