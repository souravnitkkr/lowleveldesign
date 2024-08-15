package org.shrayansh.abstractfactorypattern.vehiclefactory;

import org.shrayansh.abstractfactorypattern.vehicle.OrdinaryVehicle1;
import org.shrayansh.abstractfactorypattern.vehicle.OrdinaryVehicle2;
import org.shrayansh.abstractfactorypattern.vehicle.Vehicle;

public class OrdinaryFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(int price) {
        if(price < 500000)
            return new OrdinaryVehicle1();
        else
            return new OrdinaryVehicle2();
    }
}
