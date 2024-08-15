package org.shrayansh.nullobjectpattern;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Car"))
            return new Car();
        return new NullVehicle();
    }

}
