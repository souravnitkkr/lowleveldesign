package org.shrayansh.abstractfactorypattern.vehiclefactory;

import org.shrayansh.abstractfactorypattern.vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(int price);
}
