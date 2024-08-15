package org.shrayansh.abstractfactorypattern;

import org.shrayansh.abstractfactorypattern.vehicle.Vehicle;
import org.shrayansh.abstractfactorypattern.vehiclefactory.VehicleFactory;
import org.shrayansh.abstractfactorypattern.vehiclefactory.AbstractFactoryProducer;

public class MainDriver {
    public static void main(String[] args) {
        AbstractFactoryProducer vehicleFactoryFactory=new AbstractFactoryProducer();
        VehicleFactory vehicleFactory =vehicleFactoryFactory.getVehicleFactory("ORDINARY");
        Vehicle vehicle= vehicleFactory.getVehicle(600000);
        System.out.println(vehicle.averageSpeed());
    }
}
