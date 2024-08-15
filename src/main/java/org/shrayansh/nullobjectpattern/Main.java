package org.shrayansh.nullobjectpattern;

public class Main {
    public static void main(String[] args) {
        Vehicle bike=VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(bike);
        Vehicle car=VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(car);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating Capacity: " +vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity: "+vehicle.getTankCapacity());
    }
}
