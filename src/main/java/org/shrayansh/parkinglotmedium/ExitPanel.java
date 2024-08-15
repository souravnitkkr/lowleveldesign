package org.shrayansh.parkinglotmedium;

import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpot;
import org.shrayansh.parkinglotmedium.parkingspot.ParkingSpotType;
import org.shrayansh.parkinglotmedium.vehicle.VehicleType;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExitPanel {
    private int exitPanelId;
    private HourlyCost hourlyCost;

    public ExitPanel(int exitPanelId) {
        this.exitPanelId = exitPanelId;
        hourlyCost=new HourlyCost();
    }

    public int getExitPanelId() {
        return exitPanelId;
    }

    public int calculateDurationInHours(ParkingTicket parkingTicket){
        LocalDateTime startTime=parkingTicket.getStartTime();
        LocalDateTime endTime=parkingTicket.getEndTime();
        long noOfHours = Duration.between(startTime,endTime).toHours();
        return (int) noOfHours;
    }

    public ParkingTicket checkout(ParkingTicket parkingTicket) throws Exception {
        parkingTicket.setEndTime();
        int parkingSpotId=parkingTicket.getParkingSpotId();

        //Generating parking spot type from vehicle type
        VehicleType vehicleType = parkingTicket.getVehicleType();
        ParkingSpotType parkingSpotType = ParkingSpotType.valueOf(vehicleType.getNo_of_wheeler());

        //Getting ParkingLot instance
        ParkingLot parkingLot = ParkingLot.getInstance();
        ParkingSpot parkingSpot = parkingLot.vacateParkingSpot(parkingSpotId,parkingSpotType);
        if(parkingSpot == null)
            throw new Exception("Unable to find parking spot id or there was some issues while vacating parking spot");
        return parkingTicket;
    }

    public int calculatePrice(ParkingSpotType parkingSpotType,int noOfHours) throws Exception{
        int costPerHour = hourlyCost.getHourlyCost(parkingSpotType);
        int amount = (int) (noOfHours*costPerHour);
        return amount;
    }
}
