package org.shrayansh.abstractfactorypattern.vehiclefactory;

public class AbstractFactoryProducer {
    public VehicleFactory getVehicleFactory(String vehicleFactory){
        if(vehicleFactory.equals("LUXURY"))
            return new LuxuryFactory();
        else if(vehicleFactory.equals("ORDINARY"))
            return new OrdinaryFactory();
        else
            return null;
    }
}
