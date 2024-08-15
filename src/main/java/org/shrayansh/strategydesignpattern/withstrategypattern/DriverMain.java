package org.shrayansh.strategydesignpattern.withstrategypattern;

public class DriverMain {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Vehicle goodsVehicle=new GoodsVehicle();
        goodsVehicle.drive();
        Vehicle passengerVehicle=new PassengerVehicle();
        passengerVehicle.drive();
        Vehicle sportsVehicle=new SportsVehicle();
        sportsVehicle.drive();
        Vehicle offRoadVehicle=new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
